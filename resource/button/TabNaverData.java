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
		// �׷�� ���
	 	// ���ϸ� + ��ǰ�� + ��� �޼���
		 //���� ���� ��ǰ�ڵ� �����Ͽ��� ��� ��������
		 //���ݺ� ��ǰ ����
		//
		lstLogData = new JList(model);
		model.insertElementAt("�׽�Ʈ ���ڿ�", 0);
		model.insertElementAt("�׽�Ʈ ���ڿ�", model.getSize());
		lstLogData.setBounds(460, 12, 162, 276);
		add(lstLogData);
	
	}

	
	public void addLog(String txt) {
		model.insertElementAt(txt, model.getSize());
	}
}
