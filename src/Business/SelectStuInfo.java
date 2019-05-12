package Business;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SelectStuInfo extends JPanel{
	
	public JPanel jpanel;
	
	
	public SelectStuInfo(String test) {
		jpanel = new JPanel();
		JButton jb = new JButton(test);
		jpanel.add(jb);
	}
	
}
