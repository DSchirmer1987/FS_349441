package jukebox_eventverwaltung_dozent.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menuleiste extends JMenuBar{
	/**
	 * Menubar aufbauen
	 * 
	 * Menu - Einträge auf der Leiste / Menüs
	 * MenuItem - Einträge im Menü - Buttons im Menü
	 */
	private JMenu menuDatei = new JMenu("Datei");
	private JMenu dateiMenuNeu = new JMenu("Neu");
	private JMenuItem neuTournee = new JMenuItem("Tournee");
	private JMenuItem dateiExit = new JMenuItem("Beenden");
	private JMenuItem dateiSpeichern = new JMenuItem("Speichern");
	private JMenuItem dateiOeffnen = new JMenuItem("Öffnen");
	
	private JMenu menuBearbeiten = new JMenu("Bearbeiten");
	private JMenuItem bearbeitenSuchen = new JMenuItem("Suchen");
	
	private JMenu menuHilfe = new JMenu("Hilfe");
	private JMenuItem hilfeUeber = new JMenuItem("Über");
	
	public Menuleiste() {
		super();
		// Elemente der MenuBar von unten nach oben einfügen. Erst Items, dann Menus
		// In der Reihenfolge in der die Elemente angezeigt werden sollen
		this.menuHilfe.add(hilfeUeber);
		
		this.menuBearbeiten.add(bearbeitenSuchen);
		
		this.dateiMenuNeu.add(neuTournee);
		
		this.menuDatei.add(dateiMenuNeu);
		this.menuDatei.add(dateiOeffnen);
		this.menuDatei.add(dateiSpeichern);
		this.menuDatei.addSeparator();
		this.menuDatei.add(dateiExit);
		
		// Menus in die Menubar setzen
		add(menuDatei);
		add(menuBearbeiten);
		add(menuHilfe);
	}
}
