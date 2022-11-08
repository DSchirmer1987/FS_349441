package beispiele_abstract_interface_dozent.model.interfaces;

public class DBSpeicher implements Kundenspeicher{
	private String database;
	private String tabelle;
	
	public DBSpeicher(String database, String tabelle) {
		super();
		this.database = database;
		this.tabelle = tabelle;
	}

	@Override
	public String toString() {
		return "DBSpeicher [database=" + database + ", tabelle=" + tabelle + "]";
	}
	
	public void inTabelleSchreiben() {
		System.out.println("In die " + this.database + " | " + this.tabelle + " wird geschrieben.");
	}
	
	public void ausTabelleLoeschen() {
		System.out.println("Aus der " + this.database + " | " + this.tabelle + " wird gelöscht.");
	}

	@Override
	public void speichern() {
		this.inTabelleSchreiben();
		
	}

	@Override
	public void laden() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loeschen() {
		this.ausTabelleLoeschen();
		
	}

	@Override
	public void neu() {
		// TODO Auto-generated method stub
		
	}
}
