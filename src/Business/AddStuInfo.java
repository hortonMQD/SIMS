package Business;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddStuInfo extends PanelImpl{
	
	
	private JPanel testPanel;
	
	
	public AddStuInfo() {
		
	}
	
	public void initPanel() {
		
	}
	
	
	public void TestPanel() {
		testPanel.setLayout(new GridLayout(1, 4));
		JLabel lbId = new JLabel("ѧ��");
		JLabel lbName = new JLabel("����");
		JLabel lbSex = new JLabel("�Ա�");
		JLabel lbBirthday = new JLabel("��������");
		JLabel lbEntrance = new JLabel("��ѧʱ��");
		JLabel lbMajor = new JLabel("רҵ");
		JLabel lbClassName = new JLabel("�༶");
		JLabel lbHome = new JLabel("��ͥסַ");
	}
	
}
