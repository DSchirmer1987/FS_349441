package fahrzeugrennen_dozent.model;

public class Krankenwagen extends Auto {
	
	private boolean blaulicht;
	
	public Krankenwagen() {
		super();
		this.blaulicht = false;
	}

	public boolean isBlaulicht() {
		return blaulicht;
	}

	@Override
	public String toString() {
		return "Krankenwagen [blaulicht=" + blaulicht + ", toString()=" + super.toString() + "]";
	}
	
	public void toggleBlaulicht() {
		this.blaulicht = !this.blaulicht;
	}
}
