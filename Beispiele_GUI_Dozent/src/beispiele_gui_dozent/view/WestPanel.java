package beispiele_gui_dozent.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WestPanel extends JPanel{
	
	public WestPanel() {
		super();
		
		//Setzen des Layout auf GridLayout
		// new GridLayout(Zeilen, Spalten)
		//		- Besonderheit: Wenn eine der Angaben 0 ist, bedeutet dass das Layout
		//						entscheiden soll, wie viele erstellt werden.
		setLayout(new GridLayout(0,2));
		
		// Befüllen mit Elementen beim GridLayout:
		// Immer von Links oben angefangen
		add(new JLabel("Text 1"));
		add(new JLabel("Text 2"));
		add(new JLabel("Text 3"));
		add(new JLabel("Text 4"));
		add(new JLabel("Text 5"));
		add(new JLabel("Text 6"));
		add(new JLabel("Text 7"));
	}
}
