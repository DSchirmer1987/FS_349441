package jukebox_eventverwaltung_dozent.model;

public class Location {
	private String name;
	private String ort;
	private int maxBesucher;
	
	public Location(String name, String ort, int maxBesucher) {
		super();
		this.name = name;
		this.ort = ort;
		this.maxBesucher = maxBesucher;
	}

	public int getMaxBesucher() {
		return maxBesucher;
	}

	public void setMaxBesucher(int maxBesucher) {
		this.maxBesucher = maxBesucher;
	}

	public String getName() {
		return name;
	}

	public String getOrt() {
		return ort;
	}

	@Override
	public String toString() {
		return "Location [name=" + name + ", ort=" + ort + ", maxBesucher=" + maxBesucher + "]";
	}
}
