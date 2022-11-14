package jukebox_eventverwaltung_dozent.controller;

import java.awt.EventQueue;

import jukebox_eventverwaltung_dozent.model.Location;
import jukebox_eventverwaltung_dozent.model.Mitarbeiter;
import jukebox_eventverwaltung_dozent.model.Tournee;
import jukebox_eventverwaltung_dozent.model.Veranstaltung;
import jukebox_eventverwaltung_dozent.view.HauptButtonBar;
import jukebox_eventverwaltung_dozent.view.Hauptfenster;
import jukebox_eventverwaltung_dozent.view.Hauptinhalt;

public class AppController {
	private Hauptfenster fenster;
	private Hauptinhalt hauptinhalt;
	private HauptButtonBar hauptbuttonbar;
	private Tournee tournee;
	private Veranstaltung veranstaltung;
	private Location location;
	private Mitarbeiter mitarbeiter;
	
	public AppController() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				fenster = new Hauptfenster();
				init();
				fenster.setVisible(true);
			}
		});
	}
	
	private void init() {
		hauptinhalt = fenster.getHauptinhalt();
		hauptbuttonbar = hauptinhalt.getHauptbuttonbar();
		
		/*
		 * Funktionilität an einen Button binden
		 * ActionListener
		 */
		hauptbuttonbar.getTourneeButton().addActionListener(e -> {tourneeErstellen();});
	}
	
	private void tourneeErstellen() {
		tournee = new Tournee("Tournee 1", "21.02.2023", "25.02.2023");
		System.out.println(tournee);
	}
}
