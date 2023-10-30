package dialog;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collections;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import org.openqa.selenium.Rectangle;

import javax.swing.JButton;


import common.Layout;
import common.StringSet;
import common.ProcessTool;
import view.LoginPage;

public class LoginProcessDialog extends JDialog implements MouseListener, KeyListener {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	/**
	 * Create the dialog.
	 */
//	static ProductSearchTableModel proData;
	public static JTable proBox;
	JScrollPane logScroll;
//	public static Vector<SearchProduct> productList;
	Thread starting;

	String market;
	Vector<String> listSearchOption;
	JComboBox<String> cbSearchOption;
	JLabel save;
	public static boolean process;
	public static JProgressBar loginProgressBar;

	JLabel label;
	String  id,pw,ip,version;
	LoginPage parent;
	
	JPanel topArea;
	JLabel btnClose;
	JLabel logoTop;
	JLabel btnMinimize;

    
	public LoginProcessDialog(LoginPage parent  ,String  id, String pw,String ip, String version) {
		this.id=id;
		this.pw=pw;
		this.ip=ip;
		this.version=version;
		this.parent=parent;
		setIconImages(StringSet.MAIN_LOGO_IMAGE());

	    UIManager.put("ProgressBar.background", new Color(0xFFFFFF));
	    UIManager.put("ProgressBar.foreground", new Color(0x4D54E4));
	    UIManager.put("ProgressBar.selectionBackground", new Color(0x4D54E4));
	    UIManager.put("ProgressBar.selectionForeground", new Color(0xFFFFFF));

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		int perX = screen.getWidth()>=1920?(int) (screen.getWidth()/1920):1;
		int perY = screen.getHeight()>=1080?(int) (screen.getHeight()/1080):1;
		int currentX=(int)((screen.getWidth()/2)-200*perX);
		int currentY=(int)((screen.getHeight()/2)-160);
        
        setBounds(currentX,currentY,440,245 );
		setLayout(null);
		
		btnMinimize = new JLabel();
//		btnMinimize.setIcon(resizeButtonImage(Layout.LOGIN_MINIMIZE_BOUND(perX, perY), Layout.LOGIN_MINIMIZE));
		btnMinimize.setBounds(Layout.LOGIN_MINIMIZE_BOUND(perX, perY));
		btnMinimize.addMouseListener(this);
		
		btnClose = new JLabel();
//		btnClose.setIcon(resizeButtonImage(Layout.LOGIN_CLOSE_BOUND(perX, perY), Layout.LOGIN_CLOSE));
		btnClose.setBounds(Layout.LOGIN_CLOSE_BOUND(perX, perY));
		btnClose.addMouseListener(this);
		
		logoTop = new JLabel();
//		logoTop.setIcon(resizeButtonImage(Layout.LOGIN_TOP_BACKGROUND_BOUND(perX, perY), Layout.LOGIN_TOP_BACKGROUND));
		logoTop.setBounds(Layout.LOGIN_TOP_BACKGROUND_BOUND(perX, perY));
		logoTop.add(btnMinimize);
		logoTop.add(btnClose);
		
		topArea = new JPanel();
		topArea.setLayout(null);
		topArea.setBackground(new Color(0xEFF4FF));
		topArea.setBounds(Layout.LOGIN_TOP_AREA_BOUND(perX, perY));
		topArea.add(logoTop);
		
		loginProgressBar = new JProgressBar();
		loginProgressBar.setBounds(45, 125, 340 , 35);
		
		add(loginProgressBar);

		label = new JLabel("서버에 접속 중입니다.");
		label.setBounds(10, 10, (400*perX)-34, 20);

		setTitle("로그인을 진행중입니다.");

		setAlwaysOnTop(true);

	
		setResizable(false);

		add(label);

		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
//		processingLogin();
	}
	
	 
	public void setProgress(int value) {
		loginProgressBar.setValue(value);
	}
	
	public void setGroupStatus(int value,int total) {
		label.setText("그룹 데이터를 불러오는 중입니다. (" + value+ "/"+total+")");

		loginProgressBar.setValue( 5 + (int)(value*30/total));
		
	}
	
	public void setProductStatus(int value,int total) {

		label.setText("상품 데이터를 불러오는 중입니다. (" + value+ "/"+total+")");

		loginProgressBar.setValue( 35 + (int)(value*65/total));
		
	}
	
	public void setStart() {
		loginProgressBar.setValue( 100);
		
		label.setText("프로그램을 시작합니다.");
		
	}

	static Thread login;
//	public void processingLogin() {
//		login = new Thread(
//				new Runnable() {			
//					@Override
//					public void run() {
//
//						System.out.println("test3");
//						LoginInfo info = REST.login(id, pw, ip, version);
//						if(info!=null) {
//							System.out.println("test");
//							int productSize =0;
//							for(int i=0; i<info.getGl().size();i++) {
//								setGroupStatus(i,info.getGl().size());
//								info.getGl().get(i).setProduct( REST.getGroupData(info.getGl().get(i).getCode()));
//								
//								productSize+=info.getGl().get(i).getProduct().size();
//							}
//
//							int count=0;
//							for(int i=0; i<info.getGl().size();i++) {
//
//								boolean check=false;
//								for(int j=0; j<info.getGl().get(i).getProduct().size();j++) {
//									setProductStatus(count++, productSize);
//									System.out.println( info.getGl().get(i).getCode());
//									info.getGl().get(i).getProduct().get(j).setDetailData(
//											REST.getProductData(info.getGl().get(i).getProduct().get(j).getCode()));
//									check|=info.getGl().get(i).getProduct().get(j).getSelect();
//									
//								}
//								info.getGl().get(i).setSelectForce(check);
//							}
//							setStart();
//							ProcessTool.sleep();
//							close();
//							parent.loginFinish();
//						}else {
//							close();
//						}
//					}
//				}
//			);
//		login.start();
//	}
	

	public ImageIcon resizeButtonImage(Rectangle rec, String buttonUrl) {
		ImageIcon tempImg = new ImageIcon(buttonUrl);

		Image dimg = tempImg.getImage();
		Image img = dimg.getScaledInstance((int) rec.getWidth(), (int) rec.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(img);
		return image;
	}
	
	public void close() {
		this.dispose();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	

}

