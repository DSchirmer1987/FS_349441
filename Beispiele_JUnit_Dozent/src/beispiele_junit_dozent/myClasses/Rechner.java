package beispiele_junit_dozent.myClasses;

public class Rechner {
	private int zahl1, zahl2;

	public Rechner(int zahl1, int zahl2) {
		super();
		this.zahl1 = zahl1;
		this.zahl2 = zahl2;
	}

	public int getZahl1() {
		return zahl1;
	}

	public void setZahl1(int zahl1) {
		this.zahl1 = zahl1;
	}

	public int getZahl2() {
		return zahl2;
	}

	public void setZahl2(int zahl2) {
		this.zahl2 = zahl2;
	}

	@Override
	public String toString() {
		return "Rechner [zahl1=" + zahl1 + ", zahl2=" + zahl2 + "]";
	}
	
	public int addiere() {
		return this.zahl1 + this.zahl2;
	}
	
	public int subtrahiere() {
		return this.zahl1 - this.zahl2;
	}
	
	public int multipliziere() {
		return this.zahl1 * this.zahl2;
	}
	
	public int dividiere() {
		return this.zahl1 / this.zahl2;
	}
}
