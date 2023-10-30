package view;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;

public class TabNaverData extends JPanel {
	private JTable table;

	JList lstLogData;
	DefaultListModel model = new DefaultListModel();
	/**
	 * Create the panel.
	 */
	public TabNaverData() {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(14, 12, 422, 276);
		
		this.add(table);
		
		JList list = new JList();
		list.setBounds(460, 12, 162, 276);
		add(list);
		// 그룹명 출력
	 	// 마켓명 + 상품명 + 결과 메세지
		 //마켓 도는 상품코드 실패하였을 경우 상점오류
		 //가격비교 상품 없음
		//
		lstLogData = new JList(model);
		model.insertElementAt("테스트 문자열", 0);
		model.insertElementAt("테스트 문자열", model.getSize());
		lstLogData.setBounds(460, 12, 162, 276);
		add(lstLogData);
	
	}

	
	public void addLog(String txt) {
		model.insertElementAt(txt, model.getSize());
	}
}
