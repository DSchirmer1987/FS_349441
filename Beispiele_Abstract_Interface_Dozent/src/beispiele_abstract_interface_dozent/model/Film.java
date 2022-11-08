package beispiele_abstract_interface_dozent.model;

public abstract class Film extends Artikel{

	public Film(String artikelnummer) {
		super(artikelnummer);
	}
	
	// Abstrakte Klassen die von abstrakten Klassen erben, müssen die nicht-implementierten
	// Methoden nicht zwingend aufführen.
	// Damit wird die Implementation weitergereicht!
}
