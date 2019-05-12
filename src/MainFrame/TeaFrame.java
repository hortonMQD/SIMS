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
		
		this.setTitle("ѧ����Ϣ�������");  //���ô������
		this.setSize(600, 500);     //���ô����С
		this.setLocationRelativeTo(null);//���ô��������ʾ
		this.setVisible(true);		//���ô���ɼ�
		this.setResizable(true);   //���ô�������
		
		
		
		JPanel CardPanel = new JPanel();
		JPanel ControlPanel = new JPanel();
		CardLayout layout = new CardLayout();
		
		
		SelectStuInfo panel1 = new SelectStuInfo("��һ������");
		SelectStuInfo panel2 = new SelectStuInfo("�ڶ�������");
		SelectStuInfo panel3 = new SelectStuInfo("����������");
//		SelectStuInfo panel4 = new SelectStuInfo("���ĸ�����");
		
		
		
		
		
		
		
		
		
		CardPanel.add(panel1);
		CardPanel.add(panel2);
		CardPanel.add(panel3);
		CardPanel.setLayout(layout);
		
		
		JButton preButton = new JButton("��һ��");
		JButton nextButton = new JButton("��һ��");
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
