package beispiele_abstract_interface_dozent.model;

import beispiele_abstract_interface_dozent.model.interfaces.DBSpeicher;
import beispiele_abstract_interface_dozent.model.interfaces.DateiSpeicher;

public class Kundenverwaltung {
	private String kunde;
	//private DateiSpeicher dateiSpeicher;
	private DBSpeicher dbSpeicher;
	
	public Kundenverwaltung(String kunde) {
		this.kunde = kunde;
		//this.dateiSpeicher = new DateiSpeicher(kunde, "home/documents/");
		this.dbSpeicher = new DBSpeicher("Kundenverwaltung", kunde);
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
		//dateiSpeicher.speicherDatei();
		dbSpeicher.inTabelleSchreiben();
	}
	
	public void kundeLoeschen() {
		System.out.println("Kunde " + this.kunde + " wird gelöscht.");
		//dateiSpeicher.loescheDatei();
		dbSpeicher.ausTabelleLoeschen();
	}
}
