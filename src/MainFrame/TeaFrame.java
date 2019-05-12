package MainFrame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Business.SelectStuInfo;

public class TeaFrame extends JFrame{
	
	
	
	public TeaFrame() {
		
		this.setTitle("学生信息管理软件");  //设置窗体标题
		this.setSize(600, 500);     //设置窗体大小
		this.setLocationRelativeTo(null);//设置窗体居中显示
		this.setVisible(true);		//设置窗体可见
		this.setResizable(true);   //设置窗体锁定
		
		
		
		JPanel CardPanel = new JPanel();
		JPanel ControlPanel = new JPanel();
		CardLayout layout = new CardLayout();
		
		
		SelectStuInfo panel1 = new SelectStuInfo("第一个界面");
		SelectStuInfo panel2 = new SelectStuInfo("第二个界面");
		SelectStuInfo panel3 = new SelectStuInfo("第三个界面");
//		SelectStuInfo panel4 = new SelectStuInfo("第四个界面");
		
		
		
		
		
		
		
		
		
		CardPanel.add(panel1);
		CardPanel.add(panel2);
		CardPanel.add(panel3);
		CardPanel.setLayout(layout);
		
		
		JButton preButton = new JButton("上一张");
		JButton nextButton = new JButton("下一张");
		ControlPanel.add(preButton);
		ControlPanel.add(nextButton);
		
		this.add(CardPanel, BorderLayout.CENTER);
		this.add(ControlPanel,BorderLayout.SOUTH);
	
		
		
		
		preButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				layout.previous(CardPanel);
			}
			
		});
		
		
		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				layout.next(CardPanel);
			}
			
		});		
		
		
		
		
	}
	

}
