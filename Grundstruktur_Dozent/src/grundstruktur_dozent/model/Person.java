package grundstruktur_dozent.model;

public class Person {
	private String vorname;
	private String nachname;
	private int alter;
	private double kontostand;
	private String addresse;
	
	/*
	 * Konstruktor erzeugen mit Eclipse:
	 * 
	 * Rechtsklick -> Source
	 *  -> Generate Constructor using Fields...  auswählen
	 *  
	 *  ---> Generate anklicken!
	 */
	public Person(String vorname, String nachname, int alter, double kontostand, String addresse) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.kontostand = kontostand;
		this.addresse = addresse;
	}
	
	/*
	 * Erzeugen von Gettern + Settern
	 * Rechtsklick -> Source
	 * 	-> Generate Getter and Setters... auswählen
	 * 
	 * Auswählen welche Attribute und welche Getter und welche Setter
	 * 
	 * ---> Generate anklicken!
	 */
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

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", alter=" + alter + ", kontostand="
				+ kontostand + ", addresse=" + addresse + "]";
	}
		
}
