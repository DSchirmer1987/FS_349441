package worterbuch_dozent.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Dictionary {
	private ArrayList<DictionaryEntry> entries = new ArrayList<>();
	
	public Dictionary() {
		
	}

	public ArrayList<DictionaryEntry> getEntries() {
		return entries;
	}

	public void setEntries(ArrayList<DictionaryEntry> entries) {
		this.entries = entries;
	}

	@Override
	public String toString() {
		return "Dictionary [entries=" + entries + "]";
	}
	
	public void addGermanWord(String german, String english) {
		entries.add(new DictionaryEntry(german, english));
	}
	
	public void addEnglishWord(String english, String german) {
		entries.add(new DictionaryEntry(german, english));
	}
	
	public String translateToEnglish(String german) {
		for(DictionaryEntry entry : this.entries) {
			if(entry.getGerman().equals(german)) {
				return entry.getEnglish();
			}
		}
		return "Keine Übersetzung gefunden";
	}
	
	public String translateToGerman(String english) {
		for(DictionaryEntry entry : this.entries) {
			if(entry.getEnglish().equals(english)) {
				return entry.getGerman();
			}
		}
		return "Keine Übersetzung gefunden";
	}
	
	public void sortGerman() {
		/**
		 * Comparator - Vergleicher
		 * comparing - vergleichsmethode
		 *	
		 * 	- comparing() benötigt die Angabe WAS verglichen werden soll.
		 * 		- Klassenname::Attribut/Methode - public
		 */
		this.entries.sort(Comparator.comparing(DictionaryEntry::getGerman));
	}
	
	public void sortEnglish() {
//		String english0 = this.entries.get(0).getEnglish();
//		String english1 = this.entries.get(2).getEnglish();
//		System.out.println(english0);
//		System.out.println(english1);
//		System.out.println(english0.compareTo(english1));
//		System.out.println(english1.compareTo(english0));
		
		// 2 Hilfslisten erstellen für die Sotierung.
		ArrayList<DictionaryEntry> sorted = new ArrayList<>();
		ArrayList<DictionaryEntry> temp = this.entries;
		// Hílfsvariablen zum zwischenspeichern
		DictionaryEntry firstEntry = null;
		String first = "";
		
		// Solange wiederholen bis die Hilfsliste leer ist (wird nach jedem Durchgang um 1 Eintrag weniger
		while(temp.size() > 0) {
			outer: // Markierung für Schleifenabbruch
			for(DictionaryEntry entry : this.entries) {  // Durchlaufen aller Einträge
				for(DictionaryEntry entry2 : temp) { // Durchlaufen der Hilfslisten-Einträge
					/*
					 * Vergleichen der Werte.
					 * Bei Strings nach lexikografischen (Alphabet) Reihenfolge
					 * Wenn der Unterschied 1 Buchstabe ist, dann wird dieser Eintrag gespeichert und 
					 * 	zur List hinzugefügt.
					 */
					if(entry.getEnglish().compareTo(entry2.getEnglish()) == -1) {
						first = entry.getEnglish();
						firstEntry = entry;
						break outer; //Schleifenabbruch mit Markierung, damit die gesamte Schleife unterbrochen wird
					} 
					/*
					 * Vergleichen der Werte.
					 * Diesmal aus der Hilfsliste mit der orignal-Liste.
					 * 
					 * Wenn der Eintrag mehr als 1 Buchstabe ist (im Alphabet davor kommt)
					 * 	dann wird dieser zur Liste hinzugefügt
					 */
					else if(entry2.getEnglish().compareToIgnoreCase(entry.getEnglish()) <= 0){
						first = entry2.getEnglish();
						firstEntry = entry2;
						break; // Schleifenabbruch ohne Markierung, damit die aktuell laufende Schleife unterbrochen wird
					}
				}
			}

			sorted.add(firstEntry); // Hinzufügen des jeweils sortierten Eintrages - Reihenfolge in der Liste is gegeben.
			temp.remove(firstEntry); // Entfernen des Eintrages aus der Hilfsliste, damit dieser nicht erneut verglichen wird.
			//System.out.println(temp);
		}
		
		//System.out.println(first);
		//System.out.println(sorted);
		this.entries = sorted; // Überschreiben der Original-Liste mit der Sortierten - Ende der Methode
	}
}
