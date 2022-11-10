package beispiele_gui_dozent.view;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttonleiste extends JPanel{
	
	public Buttonleiste() {
		super();
		
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new WestPanel());
	}
}
