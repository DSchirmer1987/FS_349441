package jukebox_eventverwaltung_dozent.model;

public class Mitarbeiter {
	private int personalNummer;
	private String vorname;
	private String nachname;
	private String spezialisierung;
	private double gehalt;
	private final double GRUNDGEHALT = 2500.50;
	
	public Mitarbeiter(int personalNummer, String vorname, String nachname, String spezialisierung) {
		super();
		this.personalNummer = personalNummer;
		this.vorname = vorname;
		this.nachname = nachname;
		this.spezialisierung = spezialisierung;
		this.gehaltBerechnen();
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

	public String getSpezialisierung() {
		return spezialisierung;
	}

	public void setSpezialisierung(String spezialisierung) {
		this.spezialisierung = spezialisierung;
		this.gehaltBerechnen();
	}

	public int getPersonalNummer() {
		return personalNummer;
	}

	public double getGehalt() {
		return gehalt;
	}

	@Override
	public String toString() {
		return "Mitarbeiter [personalNummer=" + personalNummer + ", vorname=" + vorname + ", nachname=" + nachname
				+ ", spezialisierung=" + spezialisierung + ", gehalt=" + gehalt + ", GRUNDGEHALT=" + GRUNDGEHALT + "]";
	}
	
	public double gehaltBerechnen() {
		switch(this.spezialisierung) {
			case "Security":{
				this.gehalt = this.GRUNDGEHALT * 1.10;
				break;
			}
			case "Technik":{
				this.gehalt = this.GRUNDGEHALT * 1.05;
				break;
			}
			case "Catering":{
				this.gehalt = this.GRUNDGEHALT * 1.02;
				break;
			}
			case "Sanitäter":{
				this.gehalt = this.GRUNDGEHALT * 1.25;
				break;
			}
		}
		return this.gehalt;
	}
}
