package beispiele_gui_dozent.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

//JPanel = Art von Leinwand
public class Fensterinhalt extends JPanel{
	
	public Fensterinhalt() {
		super();
		
		// Setzen des Layouts nach dem der Inhalt des Panels angeordnet werden soll
		setLayout(new BorderLayout());
		
		// Einfügen von Elementen in das Panel mit beachtung vom Layout-spezifischen Angaben
		// add(Component)
		// add(Component, Layoutspezifische angabe)
		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new Buttonleiste(), BorderLayout.NORTH);
		add(new WestPanel(), BorderLayout.EAST);
		add(new WestPanel(), BorderLayout.WEST);
	}
}
