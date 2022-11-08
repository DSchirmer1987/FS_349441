package beispiele_abstract_interface_dozent;

import beispiele_abstract_interface_dozent.model.Artikel;
import beispiele_abstract_interface_dozent.model.Buch;
import beispiele_abstract_interface_dozent.model.Kundenverwaltung;
import beispiele_abstract_interface_dozent.model.KundenverwaltungB;
import beispiele_abstract_interface_dozent.model.interfaces.BeispielFunctionalInterface;

public class App {

	public static void main(String[] args) {
		// Von abstrakten Klassen können keine Objekte erzeugt werden
		// Artikel artikel = new Artikel("AB123456"); // Ist nicht zulässig!
		
//		Buch buch = new Buch("AB123456");
//		buch.beschreiben();
//		buch.kaufen();
		
		//Interface-Beispiel
		//kundenverwalten();
		
		
		//Funktionales Beispiel
		funktionalProgrammieren();
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
	
	/**
	 * Beispiel-Benutzung eines functional Interfaces mit Lambda-Ausdrücken
	 */
	public static void funktionalProgrammieren() {
		//Erstellen einer Varialben vom Typ des Interfaces
		BeispielFunctionalInterface rechner;
		
		/* 
		 * Verwenden (Ansprechen und Implementieren in einem Schritt) durch Lambda
		 * 
		 * Lambda-Ausdruck - Bietet eine 'Abkürzung' für die Implementierung
		 * Lambda funktioniert NUR mit functional Interfaces
		 * 
		 * Lambda ist immer (Parameterliste) -> {Implementierung}
		 * 		- Parameterlist IMMER wie im Interface vorgegeben - Datentyp is auch vorgegeben.
		 */
		rechner = (a, b) -> {return a * b;};
		
		System.out.println(rechner.berechne(5, 6));
	}

}
