package fahrzeugrennen_dozent.model;

public class Fahrrad extends Fahrzeug {
	
	public Fahrrad() {
		// Position, Geschwindigkeit, maxGeschwindigkeit, AnzahlRäder
		super(0, 0, 30, 2);
	}

	@Override
	public String toString() {
		return "Fahrrad [toString()=" + super.toString() + "]";
	}

}
