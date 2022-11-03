package fahrzeugrennen_dozent.model;

public class Fahrzeug {
	private double position;
	private double geschwindigkeit;
	private double maximalgeschwindigkeit = 0;
	private int anzahlRaeder = 0;
	
	public Fahrzeug(double position, double geschwindigkeit, double maximalgeschwindigkeit, int anzahlRaeder) {
		super();
		this.position = position;
		this.geschwindigkeit = geschwindigkeit;
		this.maximalgeschwindigkeit = maximalgeschwindigkeit;
		this.anzahlRaeder = anzahlRaeder;
	}
	
	public Fahrzeug() {
		this(0, 0, 0, 0);
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(double geschwindigkeit) {
		if(geschwindigkeit <= this.maximalgeschwindigkeit) {
			this.geschwindigkeit = geschwindigkeit;
		} else {
			this.geschwindigkeit = this.maximalgeschwindigkeit;
		}
	}

	public double getMaximalgeschwindigkeit() {
		return maximalgeschwindigkeit;
	}

	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}

	@Override
	public String toString() {
		return "Fahrzeug [position=" + position + ", geschwindigkeit=" + geschwindigkeit + ", maximalgeschwindigkeit="
				+ maximalgeschwindigkeit + ", anzahlRaeder=" + anzahlRaeder + "]";
	}
	
	public void bewege(double zeitdauer) {
		if (this.geschwindigkeit > 0) {
			this.position += this.geschwindigkeit * (zeitdauer / 60);
		}
	}
}
