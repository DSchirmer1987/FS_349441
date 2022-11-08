package beispiele_abstract_interface_dozent.model;

import beispiele_abstract_interface_dozent.model.interfaces.DBSpeicher;
import beispiele_abstract_interface_dozent.model.interfaces.DateiSpeicher;
import beispiele_abstract_interface_dozent.model.interfaces.Kundenspeicher;

public class KundenverwaltungB {
	private String kunde;
	private Kundenspeicher kSpeicher;
	
	public KundenverwaltungB(String kunde) {
		this.kunde = kunde;
		//this.kSpeicher = new DateiSpeicher(kunde, "home/documents/kunden/");
		this.kSpeicher = new DBSpeicher("Verwaltung", kunde);
	}

	public String getKunde() {
		return kunde;
	}

	public void setKunde(String kunde) {
		this.kunde = kunde;
	}

	@Override
	public String toString() {
		return "Kundenverwaltung [kunde=" + kunde + "]";
	}
	
	public void kundeSpeichern() {
		System.out.println("Kunde " + this.kunde + " wird gespeichert.");
		kSpeicher.speichern();
	}
	
	public void kundeLoeschen() {
		System.out.println("Kunde " + this.kunde + " wird gelöscht.");
		kSpeicher.loeschen();
	}
}
