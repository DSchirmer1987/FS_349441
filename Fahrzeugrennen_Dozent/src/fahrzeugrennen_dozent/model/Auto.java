package fahrzeugrennen_dozent.model;

public class Auto extends Fahrzeug {
	
	public Auto(double maxGeschwindigkeit) {
		super(0, 0, maxGeschwindigkeit, 4);
	}
	
	public Auto() {
		super(0, 0, 140, 4);
	}
	
	@Override
	public String toString() {
		return "Auto [toString()=" + super.toString() + "]";
	}
	
}
