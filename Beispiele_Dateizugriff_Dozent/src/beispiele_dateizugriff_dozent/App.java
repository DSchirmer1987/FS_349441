package beispiele_dateizugriff_dozent;

import beispiele_dateizugriff_dozent.model.DateiVerwaltung;

public class App {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.home") + "\\Documents");
		
		DateiVerwaltung dv = new DateiVerwaltung("Test2.txt", "Hallo Welt in einer Datei!");
		dv.schreibeInDatei();
		dv.setInhalt("Neuer Inhalt. Total schön!");
		dv.schreibeInDatei();
		
		DateiVerwaltung dvLesend = new DateiVerwaltung("BlaBla.txt", "");
		dvLesend.leseAusDatei();
	}

}
