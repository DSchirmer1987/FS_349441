package jukebox_eventverwaltung_dozent;

import jukebox_eventverwaltung_dozent.model.Location;
import jukebox_eventverwaltung_dozent.model.Mitarbeiter;
import jukebox_eventverwaltung_dozent.model.Tournee;
import jukebox_eventverwaltung_dozent.model.Veranstaltung;
import jukebox_eventverwaltung_dozent.view.Hauptfenster;

public class App {

	public static void main(String[] args) {
//		eventverwaltungsTest();
		starteGUI();
	}
	
	public static void eventverwaltungsTest() {
		Tournee tournee = new Tournee("Tournee 1", "2022-12-23", "2022-12-26");
		Location location = new Location("Berlin", "Berlin", 200);
		Veranstaltung veranstaltung = new Veranstaltung("Veranstaltung 1", "2022-12-23", "Halle", true, location);
		Mitarbeiter paul = new Mitarbeiter(123, "Paul", "Muster", "Catering");
		Mitarbeiter peter = new Mitarbeiter(256, "Peter", "Lustig", "Technik");
		veranstaltung.addMitarbeiter(paul);
		veranstaltung.addMitarbeiter(peter);
		tournee.addVeranstaltung(veranstaltung);
		
		System.out.println(tournee);
	}
	
	public static void starteGUI() {
		Hauptfenster hf = new Hauptfenster();
		hf.setVisible(true);
	}
}
