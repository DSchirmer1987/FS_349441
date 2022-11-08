package beispiele_abstract_interface_dozent;

import beispiele_abstract_interface_dozent.model.Artikel;
import beispiele_abstract_interface_dozent.model.Buch;
import beispiele_abstract_interface_dozent.model.Kundenverwaltung;
import beispiele_abstract_interface_dozent.model.KundenverwaltungB;

public class App {

	public static void main(String[] args) {
		// Von abstrakten Klassen können keine Objekte erzeugt werden
		// Artikel artikel = new Artikel("AB123456"); // Ist nicht zulässig!
		
//		Buch buch = new Buch("AB123456");
//		buch.beschreiben();
//		buch.kaufen();
		
		//Interface-Beispiel
		kundenverwalten();
	}
	
	public static void kundenverwalten() {
		Kundenverwaltung kv = new Kundenverwaltung("Mustermann");
		kv.kundeSpeichern();
		kv.kundeLoeschen();
		System.out.println("MIT INTERFACE:");
		KundenverwaltungB kvb = new KundenverwaltungB("Mustermann");
		kvb.kundeSpeichern();
		kvb.kundeLoeschen();
	}

}
