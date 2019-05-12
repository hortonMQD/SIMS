package Business;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pojo.student;

public class AddStuInfo extends PanelImpl{
	
	
	private JPanel testPanel;
	private JPanel buttonPanel;
	
	
	private JTextField Entrance;		//入学日期
	private JTextField name;
	private JTextField id;
	private JTextField className;
	private JTextField home;
	private JTextField Birthday;		//出生日期
	private JComboBox<String> sex;
	private JComboBox<String> major;
	
	
	
	public AddStuInfo() {
		initPanel();
	}
	
	public void initPanel() {
		TestPanel();
		ButtonPanel();
	}
	
	
	public void TestPanel() {
		testPanel.setLayout(new GridLayout(8, 1,10,10));
		//testPanel.setLayout(new FlowLayout());
		
		JLabel lbId = new JLabel("学号");
		id = new JTextField();
		JPanel id = new JPanel();
		id.add(lbId);
		id.add(this.id);
		
		JLabel lbName = new JLabel("姓名");
		name = new JTextField();
		JPanel name = new JPanel();
		name.add(lbName);
		name.add(this.name);
		
		JLabel lbSex = new JLabel("性别");
		sex = new JComboBox<String>();
		String comboBoxData[] = new String[] {"","男","女"};	//下拉框数据
		DefaultComboBoxModel<String> limitComboBoxModel = new DefaultComboBoxModel<String>(comboBoxData);// 创建下拉框数据模型
		sex.setModel(limitComboBoxModel);
		JPanel sex = new JPanel();
		sex.add(lbSex);
		sex.add(this.sex);
		
		
		
		
		JLabel lbBirthday = new JLabel("出生日期");
		Birthday = new JTextField();
		JLabel BirthdayFormat = new JLabel("格式为(xxxx-xx-xx)");
		JPanel birthday = new JPanel();
		birthday.add(lbBirthday);
		birthday.add(this.Birthday);
		birthday.add(BirthdayFormat);
		
		
		JLabel lbEntrance = new JLabel("入学时间");
		Entrance = new JTextField();
		JLabel EntranceFormat = new JLabel("格式为(xxxx-xx-xx)");
		JPanel entrance = new JPanel();
		entrance.add(lbEntrance);
		entrance.add(this.Entrance);
		entrance.add(EntranceFormat);
		
		
		JLabel lbMajor = new JLabel("专业");
	    major = new JComboBox<String>();
	    JPanel major = new JPanel();
		major.add(lbMajor);
		major.add(this.major);
		
		
		JLabel lbClassName = new JLabel("班级");
		className = new JTextField();
		JPanel className = new JPanel();
		className.add(lbClassName);
		className.add(this.className);
		
		JLabel lbHome = new JLabel("家庭住址");
		home = new JTextField();
		JPanel home = new JPanel();
		home.add(lbHome);
		home.add(this.home);
		
		
		testPanel.add(id);
		testPanel.add(name);
		testPanel.add(sex);
		testPanel.add(birthday);
		testPanel.add(entrance);
		testPanel.add(major);
		testPanel.add(className);
		testPanel.add(home);
		this.add(testPanel,BorderLayout.CENTER);
		
		
	}
	
	
	public void ButtonPanel() {
		JButton confirm = new JButton("确   定");
		JButton cancel = new JButton("取   消");
		buttonPanel.add(confirm);
		buttonPanel.add(cancel);
		
		
		confirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				student stu = new student();
				stu.setBirthday(Birthday.getText().trim());
				stu.setClassName(className.getText().trim());
				stu.setEntrance(Entrance.getText().trim());
				stu.setHome(home.getText().trim());
				stu.setId(id.getText().trim());
				stu.setName(name.getText().trim());
				stu.setMajor(major.getSelectedItem().toString());
				stu.setSex(sex.getSelectedItem().toString());
				
				
			}			
		});
		
		
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}			
		});
		
		this.add(buttonPanel,BorderLayout.SOUTH);
	}
	
	
	
}
