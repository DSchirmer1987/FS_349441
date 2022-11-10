package jukebox_eventverwaltung_dozent.model;

import java.util.ArrayList;

public class Tournee {
	private String name;
	private String start;
	private String ende;
	private ArrayList<Veranstaltung> veranstaltungen;
		
	public Tournee(String name, String start, String ende) {
		super();
		this.name = name;
		this.start = start;
		this.ende = ende;
		this.veranstaltungen = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnde() {
		return ende;
	}

	public void setEnde(String ende) {
		this.ende = ende;
	}

	public ArrayList<Veranstaltung> getVeranstaltungen() {
		return veranstaltungen;
	}

	@Override
	public String toString() {
		return "Tournee [name=" + name + ", start=" + start + ", ende=" + ende + ", veranstaltungen=" + veranstaltungen
				+ "]";
	}

	public void addVeranstaltung(Veranstaltung v) {
		this.veranstaltungen.add(v);
	}
}
