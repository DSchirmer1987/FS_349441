package bestandsverwaltung_dozent.model;
/*
 * Suchen und ersetzen:
 * Strg + F:
 * Oberer Wert = das was gesucht wird
 * Unterer Wert = mit dem soll das gesuchte ersetzt werden
 */
public class Address {
	private String vorname = "Max";
	private String nachname = "Mustermann";
	private String strasse = "Musterstraße";
	private String hausnummer = "1a";
	private String plz = "12345";
	private String ort = "Musterstadt";
	
	public Address(String vorname, String nachname, String strasse, String hausnummer, String plz, String ort) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public String toString() {
		return this.vorname + " " + this.nachname + " " + this.strasse + " " + this.hausnummer + " " + this.plz + " " + this.ort;
	}
	
	public void printAddress() {
		System.out.println(this.toString());
	}
}
