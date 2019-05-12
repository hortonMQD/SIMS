package MainFrame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Business.SelectStuInfo;

public class TeaFrame extends JFrame{
	
	
	
	public TeaFrame() {
		
		this.setTitle("学生信息管理软件");  //设置窗体标题
		this.setSize(600, 500);     //设置窗体大小
		this.setLocationRelativeTo(null);//设置窗体居中显示
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击退出同时关闭进程
		this.setVisible(true);		//设置窗体可见
		this.setResizable(true);   //设置窗体锁定
		
		
		
		//JFrame jf = new JFrame();
		//JPanel jp2 = new SelectStuInfo("1111");
		//JPanel jp3 = new SelectStuInfo("2222");
		JButton jp2 = new JButton("1111");
		JButton jp3 = new JButton("2222");
		JPanel jp = new JPanel();
		JPanel jp1 = new JPanel();
		CardLayout card = new CardLayout();
		jp.setLayout(card);
		this.getContentPane().add(jp,BorderLayout.CENTER);
		this.getContentPane().add(jp1,BorderLayout.SOUTH);
		//jf.add(jp);
		//jf.add(jp1,BorderLayout.SOUTH);
		
		
		
		
		//jp.add("1",jp2);
		//jp.add("2",jp3);
		
		
		card.addLayoutComponent(jp2, "1");
		card.addLayoutComponent(jp3, "2");
		
		
		JButton jb1 = new JButton("第一");
		JButton jb2 = new JButton("第二");
		
		jp1.add(jb1);
		jp1.add(jb2);

		
		
		
		jb1.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				card.first(jp);
			}

		});
		
		
		jb2.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				card.previous(jp);
			}

		});
		
	}
	

}
