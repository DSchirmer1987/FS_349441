package jukebox_eventverwaltung_dozent.view;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class HauptButtonBar extends JPanel{
	private WhiteRoundButton tourneeButton = new WhiteRoundButton("Tournee");
	private WhiteRoundButton veranstaltungButton = new WhiteRoundButton("Veranstaltung");
	private WhiteRoundButton locationButton = new WhiteRoundButton("Location");
	private WhiteRoundButton mitarbeiterButton = new WhiteRoundButton("Mitarbeiter");
	
	public WhiteRoundButton getTourneeButton() {
		return tourneeButton;
	}

	public WhiteRoundButton getVeranstaltungButton() {
		return veranstaltungButton;
	}

	public WhiteRoundButton getLocationButton() {
		return locationButton;
	}

	public WhiteRoundButton getMitarbeiterButton() {
		return mitarbeiterButton;
	}

	public HauptButtonBar() {
		super();
		/*
		 * Flowlayout Anpassung
		 * Konstruktor
		 *
		 * FlowLayout(Align, hgap, vgap)
		 * Align = Wo soll angeordnet werden (LEFT, RIGHT, CENTER)
		 * hgap = horizontaler abstand
		 * vgap = vertikaler abstand
		 */
		setLayout(new FlowLayout(FlowLayout.CENTER, 150, 25));
		setBackground(new Color(204, 204, 204));
		/**
		 * Border
		 * setBorder(Border)
		 * 
		 * 	BorderFactory = Factory-Klasse die Methoden zum einfachen erstellen von Bordern bereitstellt
		 * 	 	- createLineBorder = Einfache Linie
		 * 		- createEmptyBorder = Unsichtbarer Border
		 * 		- createRaisedBevelBorder = Hervorgehobene Border
		 * 		- createLoweredBevelBorder = Untergehende Border
		 */
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		add(tourneeButton);
		add(veranstaltungButton);
		add(locationButton);
		add(mitarbeiterButton);
//		tourneeButton.setBackground(Color.WHITE);
//		veranstaltungButton.setBackground(Color.WHITE);
//		locationButton.setBackground(Color.WHITE);
//		mitarbeiterButton.setBackground(Color.WHITE);
	}
}
