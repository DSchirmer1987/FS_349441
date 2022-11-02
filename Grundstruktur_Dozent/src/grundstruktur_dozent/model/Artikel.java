package grundstruktur_dozent.model;

public class Artikel {
	//Attribute
	private String bezeichnung;
	private String artikelNummer;
	
	//Konstruktor(en)
	public Artikel(String bezeichnung, String artikelNummer) {
		this.bezeichnung = bezeichnung;
		this.artikelNummer = artikelNummer;
	}
	
	// Getter & Setter (Setter nur wenn von außen die Werte veränderbar sein sollen)
	public String getBezeichnung() {
		return this.bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public String getArtikelNummer() {
		return this.artikelNummer;
	}
	public void setArtikelNummer(String artikelNummer) {
		this.artikelNummer = artikelNummer;
	}
	
	//toString() - Methode
	public String toString() {
		return "Artikel: Bezeichnung = " + this.bezeichnung + " ArtikelNummer = " + this.artikelNummer;
	}
	
	// Klassenmethoden (Eigene Methoden)
}
