package bestandsverwaltung_dozent.model;

public class MotorVehicle {
	/*
	 	 eine Größe, repräsentiert durch Länge, Breite und Höhe
		 ein Gewicht
		 eine Automarke
		 einen Endkunden
		 eine Startadresse
		 eine Zieladresse
	 */
	private double[] groeße = new double[3];
	private double gewicht;
	private String automarke;
	private boolean endkunde;
	private Address startAdresse;
	private Address zielAdresse;
	
	public MotorVehicle(double[] groeße, double gewicht, String automarke, boolean endkunde, Address startAdresse, Address zielAdresse) {
		super();
		this.groeße = groeße;
		this.gewicht = gewicht;
		this.automarke = automarke;
		this.endkunde = endkunde;
		this.startAdresse = startAdresse;
		this.zielAdresse = zielAdresse;
	}

	public Address getStartAdresse() {
		return startAdresse;
	}

	public void setStartAdresse(Address startAdresse) {
		this.startAdresse = startAdresse;
	}

	public Address getZielAdresse() {
		return zielAdresse;
	}

	public void setZielAdresse(Address zielAdresse) {
		this.zielAdresse = zielAdresse;
	}
	
	public String toString() {
		String fahrzeug = "Größe des Fahrzeuges: " + this.groeße[0] + " x " + this.groeße[1] + " x " + this.groeße[2] + System.lineSeparator();
		fahrzeug += "Gewicht: " + this.gewicht + System.lineSeparator();
		fahrzeug += "Automarke: " + this.automarke + System.lineSeparator();
		fahrzeug += "Absenderadresse: " + this.startAdresse.toString() + System.lineSeparator();
		fahrzeug += "Zieladresse:" + this.zielAdresse.toString() + System.lineSeparator();
		if(endkunde == false) {
			fahrzeug += "Kein Selbstabholer" + System.lineSeparator();
		}
		return fahrzeug;
		
		/*
		 * Für Zeilenumbrüche immer System.lineSeperator() nutzen.
		 * 
		 * System.lineSeperator() gibt die Betriebssystemspezifische Zeilenumbrüche zurück.
		 * 
		 * \n erstellt einfach nur ein newLine-tag für texte - Möglicherweise wird dies nicht korrekt von allen Betriebssystem interpretiert.
		 */
	}
	
	/*
	 *  "Größe des Fahrzeugs: "<länge>" x "<breite>" x "<höhe>
		"Gewicht: "<gewicht>"
		"Automarke: "<automarke>"
		"Absenderadresse: "<adresse>"
		"Zieladresse: "<adresse>"
	 */
	public void printMotorVehicle() {
		System.out.println(this.toString());
	}
}
