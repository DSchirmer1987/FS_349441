package beispiele_gui_dozent.view;

import javax.swing.JFrame;

public class Hauptfenster extends JFrame{
	
	public Hauptfenster() {
		super();
		// Größe des Fensters setzen
		setSize(1280, 720);
		
		// Verhalten steuern beim Schließen des Fensters
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Verhindern dass das Fenter verkleinert/vergrößert wird
		setResizable(false);
		
		// Setzen des Fentersinhaltes
		setContentPane(new Fensterinhalt());
	}
}
