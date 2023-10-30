package view;

import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import common.Layout;
import common.StringSet;
import dialog.CustomDialog;
import dialog.LoginProcessDialog;
import common.ProcessTool;


public class LoginPage extends JFrame
		implements FocusListener, MouseMotionListener, MouseListener, KeyListener, WindowListener {

	// private static JPanel leftArea;
	int perX;
	int perY;
	int currentX;
	int currentY;
	int startX;
	int startY;
	
	JPanel topArea;
	JLabel logoTop;
	JLabel btnMinimize;
	
	JPanel leftArea;
	JLabel logoLoginText;
	JLabel loginTextfield;
	JLabel saveAccount;
	JLabel findAccount;
	JLabel btnRemote;
	JLabel btnLogin;
	
	JPanel rightArea;
	JLabel logoRight;

	JLabel laSave;
	JLabel btnClose;
	JTextField tfID;
	JPasswordField tfPW;

	JCheckBox chSave;
	Properties prop = new Properties();

	private ServerSocket serverSocket;
	private InetAddress ip;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
//					String key ="JTA1JUNDVyVCRUMlQUElMjYlM0ElRUIlREUlRTdWJUNGJTA4JUE2JUI0cG0lOTIlN0ZXJUE5JUUwJUZBJUREJUQwJUQ4JTI2SlUlMEMlOTklREQlOUIlQTElM0UlMDlEJTA1JUM4JTIzJUNDJUFGJUNE";
//					ApiGodo5.getShopInfo(key);
					System.setProperty(ProcessTool.WEB_DRIVER_ID, ProcessTool.WEB_DRIVER_PATH);
					new LoginPage();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	String currentVersion;

	public LoginPage() {
		try {
			serverSocket = new ServerSocket(StringSet.processPort);
			ip = InetAddress.getLocalHost();

			ServerSocket serverSocket2 = new ServerSocket(StringSet.processPort2);


			serverSocket2.close();
		} catch (IOException e) {
			// port가 이미 점유되어 있는 경우 Exception 발생
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "이미 실행중인 af프로그램이 있습니다.");
			System.exit(0);
		}
		
		try {
		File file = new File("readme.txt");
		// 입력 스트림 생성
		FileReader filereader = new FileReader(file);
		int singleCh = 0;
		String temp = "";
		while ((singleCh = filereader.read()) != -1) {
			temp += (char) singleCh;
		}
		filereader.close();
		JsonParser parser = new JsonParser();
		JsonObject respone = (JsonObject) parser.parse(temp);
		currentVersion = respone.get("version").getAsString();
		}catch (Exception e) {
			// TODO: handle exception
		}

//		JOptionPane.showMessageDialog(null,ip.getHostAddress()+"\n"+ip.getCanonicalHostName()+"\n"+ip.getLoopbackAddress());
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getCanonicalHostName());
		System.out.println(currentVersion);
		getContentPane().setLayout(null);
		setTitle("다운탑 MMP (Monitoring Management Program)");

		setIconImages(StringSet.MAIN_LOGO_IMAGE());
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

		perX = screen.getWidth() >= 1920 ? (int) (screen.getWidth() / 1920) : 1;
		perY = screen.getHeight() >= 1080 ? (int) (screen.getHeight() / 1080) : 1;

		btnMinimize = new JLabel();
		btnMinimize.setIcon(resizeButtonImage(Layout.LOGIN_MINIMIZE_BOUND(perX, perY), Layout.LOGIN_MINIMIZE));
		btnMinimize.setBounds(Layout.LOGIN_MINIMIZE_BOUND(perX, perY));
		btnMinimize.addMouseListener(this);
		
		btnClose = new JLabel();
		btnClose.setIcon(resizeButtonImage(Layout.LOGIN_CLOSE_BOUND(perX, perY), Layout.LOGIN_CLOSE));
		btnClose.setBounds(Layout.LOGIN_CLOSE_BOUND(perX, perY));
		btnClose.addMouseListener(this);
		
		logoTop = new JLabel();
		logoTop.setIcon(resizeButtonImage(Layout.LOGIN_TOP_BACKGROUND_BOUND(perX, perY), Layout.LOGIN_TOP_BACKGROUND));
		logoTop.setBounds(Layout.LOGIN_TOP_BACKGROUND_BOUND(perX, perY));
		logoTop.add(btnMinimize);
		logoTop.add(btnClose);
		
		topArea = new JPanel();
		topArea.setLayout(null);
		topArea.setBackground(new Color(0xEFF4FF));
		topArea.setBounds(Layout.LOGIN_TOP_AREA_BOUND(perX, perY));
		topArea.add(logoTop);

		logoLoginText = new JLabel();
		logoLoginText.setIcon(resizeButtonImage(Layout.LOGIN_TEXT_BOUND(perX, perY), Layout.LOGIN_TEXT));
		logoLoginText.setBounds(Layout.LOGIN_TEXT_BOUND(perX, perY));
		
		loginTextfield = new JLabel();
		loginTextfield.setIcon(resizeButtonImage(Layout.LOGIN_TEXTFIELD_BOUND(perX, perY), Layout.LOGIN_TEXTFIELD));
		loginTextfield.setBounds(Layout.LOGIN_TEXTFIELD_BOUND(perX, perY));
		
		tfID = new JTextField();
		tfID.setBounds(Layout.LOGIN_ID_FILED_BOUND(perX, perY));
		tfID.setText(prop.getProperty("id"));
		tfID.setBorder(new LineBorder(Color.GRAY, 0));
		tfID.addKeyListener(this);
		
		tfPW = new JPasswordField();
		tfPW.setBounds(Layout.LOGIN_PW_FILED_BOUND(perX, perY));
		tfPW.setText(prop.getProperty("pw"));
		tfPW.setBorder(new LineBorder(Color.GRAY, 0));
		tfPW.addKeyListener(this);
		
		saveAccount = new JLabel();
		saveAccount.setIcon(resizeButtonImage(Layout.LOGIN_SAVEACCOUNT_BOUND(perX, perY), Layout.LOGIN_SAVEACCOUNT));
		saveAccount.setBounds(Layout.LOGIN_SAVEACCOUNT_BOUND(perX, perY));
		
		findAccount = new JLabel();
		findAccount.setIcon(resizeButtonImage(Layout.LOGIN_FINDACCOUNT_BOUND(perX, perY), Layout.LOGIN_FINDACCOUNT));
		findAccount.setBounds(Layout.LOGIN_FINDACCOUNT_BOUND(perX, perY));
		findAccount.addMouseListener(this);
		
		chSave = new JCheckBox();
		chSave.setBounds(Layout.LOGIN_SAVE_CHECK_BOUND(perX, perY));
		chSave.setBackground(new Color(0xEFF4FF));
		
		btnRemote = new JLabel();
		btnRemote.setIcon(resizeButtonImage(Layout.LOGIN_REMOTE_BOUND(perX, perY), Layout.LOGIN_REMOTE));
		btnRemote.setBounds(Layout.LOGIN_REMOTE_BOUND(perX, perY));
		btnRemote.addMouseListener(this);
		
		btnLogin = new JLabel();
		btnLogin.setIcon(resizeButtonImage(Layout.LOGIN_BUTTON_BOUND(perX, perY), Layout.LOGIN_BUTTON));
		btnLogin.setBounds(Layout.LOGIN_BUTTON_BOUND(perX, perY));
		btnLogin.addMouseListener(this);

		
		leftArea = new JPanel();
		leftArea.setLayout(null);
		leftArea.setBackground(new Color(0xEFF4FF));
		leftArea.setBounds(Layout.LOGIN_LEFT_AREA_BOUND(perX, perY));
		leftArea.add(btnRemote);
		leftArea.add(btnLogin);
		leftArea.add(findAccount);
		leftArea.add(logoLoginText);
		leftArea.add(tfID);
		leftArea.add(tfPW);
		leftArea.add(loginTextfield);
		leftArea.add(saveAccount);
		leftArea.add(chSave);
		
		
		logoRight = new JLabel();
		logoRight.setIcon(resizeButtonImage(Layout.LOGIN_RIGHT_BACKGROUND_BOUND(perX, perY), Layout.LOGIN_RIGHT_BACKGROUND));
		logoRight.setBounds(Layout.LOGIN_RIGHT_BACKGROUND_BOUND(perX, perY));
		
		rightArea = new JPanel();
		rightArea.setLayout(null);
		rightArea.setBackground(new Color(0xEFF4FF));
		rightArea.setBounds(Layout.LOGIN_RIGHT_AREA_BOUND(perX, perY));
		rightArea.add(logoRight);
		
		add(topArea);
		add(leftArea);
		add(rightArea);
		addMouseListener(this);
		addMouseMotionListener(this);
		setIconImages(StringSet.MAIN_LOGO_IMAGE());
		setTitle("다운탑 MMP(Monitoring Management Program) Ver " + System.class.getPackage().getImplementationVersion());
		currentX = (int) ((screen.getWidth() / 2) - 960 * perX);
		currentY = (int) ((screen.getHeight() / 2) - 480 * perY);

		setBounds(currentX, currentY, 1920 * perX, 960 * perY);
		setUndecorated(true);
		setVisible(true);
		
		String orderID = "mGxr45jrjtCtz3lP+loXVA==";


		try (InputStream output = new FileInputStream(new File("resource/config.properties"))) {
			// set the properties value
			prop.load(output);
			if (prop.getProperty("save").equals("t")) {
				tfID.setText(prop.getProperty("id"));
				tfPW.setText(prop.getProperty("pw"));
				chSave.setSelected(true);
			}
			// save properties to project root folder
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	public void processLogin() {
		if (tfID.getText().length() == 0) {
			new CustomDialog();
			return;
		
		}
		if (tfPW.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "PW를 입력하여 주세요");
			return;
		}
		new LoginProcessDialog(this, tfID.getText(), tfPW.getText(), ip.getHostAddress(), currentVersion);
	}

	public void loginFinish() {
		if (chSave.isSelected()) {
			try (OutputStream output = new FileOutputStream("resource/config.properties")) {
				// set the properties value
				prop.setProperty("id", tfID.getText());
				prop.setProperty("pw", tfPW.getText());
				prop.setProperty("save", "t");
				// save properties to project root folder

				prop.store(output, null);
				System.out.println(prop);

			} catch (IOException io) {
				io.printStackTrace();
			}

		} else {
			try (OutputStream output = new FileOutputStream("resource/config.properties")) {
				// set the properties value
				prop.setProperty("id", "");
				prop.setProperty("pw", "");
				prop.setProperty("save", "");

				// save properties to project root folder
				prop.store(output, null);
				System.out.println(prop);

			} catch (IOException io) {
				io.printStackTrace();
			}
		}
		try {
			if (serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.dispose();
		new MainPage();
	}

	public ImageIcon resizeButtonImage(Rectangle rec, String buttonUrl) {
		ImageIcon temImg = new ImageIcon(buttonUrl);

		Image dimg = temImg.getImage();
		Image img = dimg.getScaledInstance((int) rec.getWidth(), (int) rec.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(img);
		return image;
	}

	public void openBrowser(String url) {
		try {
			Desktop.getDesktop().browse(new URI(url));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(btnClose)) {
			System.exit(0);
		} else if (e.getSource().equals(btnMinimize)) {
			this.setState(JFrame.ICONIFIED);
		} else if (e.getSource().equals(btnRemote)) {
			openBrowser(StringSet.HOME_PAGE_REMOTE);
		} else if (e.getSource().equals(btnLogin)) {
			processLogin();
		} else if (e.getSource().equals(findAccount)) {
			openBrowser(StringSet.HOME_PAGE_FINDACCOUNT);
			
		} 
//			else if (e.getSource().equals(btnLogin)) {
//			processLogin();
//		} 
//		
		
	}
	
	public static void accountDelete() {
		

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(btnClose)) {
			btnClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		} else if (e.getSource().equals(btnMinimize)) {
			btnMinimize.setCursor(new Cursor(Cursor.HAND_CURSOR));
		} else if (e.getSource().equals(btnRemote)) {
			btnRemote.setCursor(new Cursor(Cursor.HAND_CURSOR));
		} else if (e.getSource().equals(btnLogin)) {
			btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		} else if (e.getSource().equals(findAccount)) {
			findAccount.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}	
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(btnClose)) {
			btnClose.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		} else if (e.getSource().equals(btnMinimize)) {
			btnMinimize.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		} else if (e.getSource().equals(btnRemote)) {
			btnRemote.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		} else if (e.getSource().equals(btnLogin)) {
			btnLogin.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		} else if (e.getSource().equals(findAccount)) {
			findAccount.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(btnClose)) {
			System.exit(0);
		} else if (e.getSource().equals(btnMinimize)) {
			this.setState(JFrame.ICONIFIED);
		} else if (e.getSource().equals(btnLogin)) {
		} else {
			startX = e.getXOnScreen();
			startY = e.getYOnScreen();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX() + ":" + e.getY());
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			processLogin();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		currentX = currentX - (startX - e.getXOnScreen());
		currentY = currentY - (startY - e.getYOnScreen());
		startX = e.getXOnScreen();
		startY = e.getYOnScreen();
		setLocation(currentX, currentY);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println(e.getXOnScreen()+":"+e.getYOnScreen());

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

}

class Solution {

	public static int comb(int a, int b) {
		int com = 1;
		for (int i = a; i >= 1; i--) {
			com *= i;
		}
		for (int j = a - b; j >= 1; j--) {
			com /= j;
		}
		for (int k = b; k >= 1; k--) {
			com /= k;
		}
		return com;
	}

	public static int primecount(int c) {
		for (int i = 2; i < c; i++) {
			if (c % i == 0)
				c = 0;
		}
		return c;
	}

	public int solution(int[] nums) {
		int answer = 0;
		int count = 0;
		int[] sum = new int[comb(nums.length, 3)];
		for (int i = 0; i <= nums.length - 1; i++) {
			for (int j = i + 1; j <= nums.length - 1; j++) {
				for (int k = j + 1; k <= nums.length - 1; k++) {
					sum[count] = nums[i] + nums[j] + nums[k];
					count++;
				}

			}

		}
		for (int d = 0; d < comb(nums.length, 3); d++) {
			if (sum[d] != 0)
				if (primecount(sum[d]) != 0)
					answer++;
		}

		return answer;
	}
}
