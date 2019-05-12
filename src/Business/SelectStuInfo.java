package Business;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SelectStuInfo extends PanelImpl{
	
	
	
	public SelectStuInfo(String test) {
		initPanel(test);
	}
	
	
	public void initPanel() {
		
	}
	
	
	public void initPanel(String test) {
		JButton jb = new JButton(test);
		this.add(jb,JButton.CENTER);
	}
}
