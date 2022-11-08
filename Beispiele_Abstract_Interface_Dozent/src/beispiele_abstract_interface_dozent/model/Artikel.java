package beispiele_abstract_interface_dozent.model;

public abstract class Artikel {
	private String artikelnummer;
	
	public Artikel(String artikelnummer) {
		this.artikelnummer = artikelnummer;
	}

	public String getArtikelnummer() {
		return artikelnummer;
	}

	public void setArtikelnummer(String artikelnummer) {
		this.artikelnummer = artikelnummer;
	}

	@Override
	public String toString() {
		return "Artikel [artikelnummer=" + artikelnummer + "]";
	}
	
	public void kaufen() {
		System.out.println("Artikel wird gekauft");
	}
	
	/*
	 * Abstrakte Methode
	 * Schlüsselwort abstract
	 * 
	 * Abstrakte Methoden sind immer unausgefüllte Methoden, die bei der Vererbung konkretisiert werden
	 */
	public abstract void beschreiben();
}
