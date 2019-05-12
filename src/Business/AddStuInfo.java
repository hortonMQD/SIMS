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
		JLabel lbId = new JLabel("学号");
		JLabel lbName = new JLabel("姓名");
		JLabel lbSex = new JLabel("性别");
		JLabel lbBirthday = new JLabel("出生日期");
		JLabel lbEntrance = new JLabel("入学时间");
		JLabel lbMajor = new JLabel("专业");
		JLabel lbClassName = new JLabel("班级");
		JLabel lbHome = new JLabel("家庭住址");
	}
	
}
