package beispiele_abstract_interface_dozent.model;

public class Buch extends Artikel {
	
	public Buch(String artikelnummer) {
		super(artikelnummer);
	}
	
	@Override
	public String toString() {
		return "Buch [getArtikelnummer()=" + getArtikelnummer() + "]";
	}

	// Geerbte Abstrakte Methode muss konkretisiert werden.
	@Override
	public void beschreiben() {
		System.out.println("Dies ist ein Buch");
	}
	
}
