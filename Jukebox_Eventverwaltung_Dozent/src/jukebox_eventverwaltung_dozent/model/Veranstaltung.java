package jukebox_eventverwaltung_dozent.model;

import java.util.ArrayList;

public class Veranstaltung {
	private String name;
	private String datum;
	private String veranstaltungsart;
	private boolean aktiv;
	private Location location;
	private ArrayList<Mitarbeiter> mitarbeiter;
	
	public Veranstaltung(String name, String datum, String veranstaltungsart, boolean aktiv, Location location) {
		super();
		this.name = name;
		this.datum = datum;
		this.veranstaltungsart = veranstaltungsart;
		this.aktiv = aktiv;
		this.location = location;
		this.mitarbeiter = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getVeranstaltungsart() {
		return veranstaltungsart;
	}

	public void setVeranstaltungsart(String veranstaltungsart) {
		this.veranstaltungsart = veranstaltungsart;
	}

	public boolean isAktiv() {
		return aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public ArrayList<Mitarbeiter> getMitarbeiter() {
		return mitarbeiter;
	}

	@Override
	public String toString() {
		return "Veranstaltung [name=" + name + ", datum=" + datum + ", veranstaltungsart=" + veranstaltungsart
				+ ", aktiv=" + aktiv + ", location=" + location + ", mitarbeiter=" + mitarbeiter + "]";
	}

	public void addMitarbeiter(Mitarbeiter m) {
		this.mitarbeiter.add(m);
	}
	
	public void removeMitarbeiter(Mitarbeiter m) {
		this.mitarbeiter.remove(m);
	}
}
