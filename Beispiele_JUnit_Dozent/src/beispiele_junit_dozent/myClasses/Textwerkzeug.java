package beispiele_junit_dozent.myClasses;

public class Textwerkzeug {
	private String eingabe, ausgabe;

	public Textwerkzeug(String eingabe) {
		super();
		this.eingabe = eingabe;
		this.ausgabe = "";
	}

	public String getEingabe() {
		return eingabe;
	}

	public void setEingabe(String eingabe) {
		this.eingabe = eingabe;
	}

	public String getAusgabe() {
		return ausgabe;
	}

	@Override
	public String toString() {
		return "Textwerkzeug [eingabe=" + eingabe + ", ausgabe=" + ausgabe + "]";
	}
	
	public void umdrehen() {
		this.ausgabe = "";
		for(int i = this.eingabe.length() -1; i >= 0; i--) {
			ausgabe += this.eingabe.charAt(i);
		}
	}
	
	public void umdrehenGross() {
		this.ausgabe = "";
		this.umdrehen();
		this.ausgabe = this.ausgabe.toUpperCase();
	}
}
