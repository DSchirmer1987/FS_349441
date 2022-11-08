package beispiele_abstract_interface_dozent.model.interfaces;

public class DateiSpeicher implements Kundenspeicher{
	private String dateiName;
	private String dateiPfad;
	
	public DateiSpeicher(String dateiName, String dateiPfad) {
		super();
		this.dateiName = dateiName;
		this.dateiPfad = dateiPfad;
	}

	public String getDateiName() {
		return dateiName;
	}

	public String getDateiPfad() {
		return dateiPfad;
	}

	@Override
	public String toString() {
		return "DateiSpeicher [dateiName=" + dateiName + ", dateiPfad=" + dateiPfad + "]";
	}
	
	public void speicherDatei() {
		System.out.println(this.dateiPfad + this.dateiName + " wird gespeichert.");
	}
	
	public void loescheDatei() {
		System.out.println(this.dateiPfad + this.dateiName + " wird gelöscht.");
	}

	@Override
	public void speichern() {
		this.speicherDatei();
	}

	@Override
	public void laden() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loeschen() {
		this.loescheDatei();
	}

	@Override
	public void neu() {
		// TODO Auto-generated method stub
		
	}
}
