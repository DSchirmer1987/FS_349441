package jukebox_eventverwaltung_dozent.view;

import javax.swing.JFrame;

public class Hauptfenster extends JFrame{
	private Hauptinhalt hauptinhalt = new Hauptinhalt();
	
	public Hauptinhalt getHauptinhalt() {
		return hauptinhalt;
	}

	public Hauptfenster() {
		super();
		setSize(1280, 720);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("JukeBox Eventverwaltung");
		
		// Setzen der Menübar
		setJMenuBar(new Menuleiste());
		
		setContentPane(hauptinhalt);
	}
}
