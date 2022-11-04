package beispiele_collections_dozent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		//arbeitenMitArrayList();
		//arbeitenMitTreeSet();
		//arbeitenMitHashSet();
		//arbeitenMitTreeMap();
		arbeitenMitHashMap();
	}
	
	/**
	 * ArrayList 
	 * 
	 * Erstellen einer ArrayList
	 * Befüllen der ArrayList
	 * Ausgeben der ArrayList
	 * weitere Funktionalitäten
	 */
	public static void arbeitenMitArrayList() {
		ArrayList<Integer> zahlenListe = new ArrayList<>();
		
		zahlenListe.add(0);
		zahlenListe.add(1);
		for(int i = 2; i <= 10; i++) {
			zahlenListe.add(i);
		}
		
		System.out.println(zahlenListe);
		System.out.println(zahlenListe.get(5));
		System.out.println("Zahlenlist-Größe: " + zahlenListe.size());
		
		zahlenListe.remove(4);
		System.out.println(zahlenListe);
		System.out.println("Zahlenlist-Größe: " + zahlenListe.size());
		
		zahlenListe.add(4, 123);
		System.out.println(zahlenListe);
		System.out.println("Zahlenlist-Größe: " + zahlenListe.size());
		
		System.out.println(zahlenListe.contains(123));
		
		zahlenListe.set(8, 42);
		System.out.println(zahlenListe);
		System.out.println("Zahlenlist-Größe: " + zahlenListe.size());
		
		zahlenListe.add(984);
		System.out.println(zahlenListe);
		System.out.println("Zahlenlist-Größe: " + zahlenListe.size());
				
		zahlenListe.clear();
		System.out.println(zahlenListe);
		System.out.println(zahlenListe.contains(123));
	}
	
	/**
	 * TreeSet - Ist immer sortiert (Alphabetisch / Numerisch)
	 *  - Set = KEINE doppelten Elemente enthalten.
	 *  - Set = Kein Index vorhanden
	 * Erstellung, Befüllen, Ausgeben
	 * 
	 */
	public static void arbeitenMitTreeSet() {
		TreeSet<String> artikel = new TreeSet<>();
		// Mehr-Dimensional:
		TreeSet<TreeSet<String>> zweiDimTreeSet = new TreeSet<>();
		
		artikel.add("Java Buch");
		artikel.add("Python Buch");
		artikel.add("Dinsey Film");
		System.out.println(artikel);
		
		artikel.add("Java Buch");
		System.out.println(artikel);
		
		System.out.println(artikel.size());
		
		System.out.println(artikel.subSet("B", "P"));
		
		System.out.println(artikel.first());
		System.out.println(artikel.last());		
	}
	
	/**
	 * HashSet - Nicht sortiert. Reihenfolge nicht vorhersagbar.
	 *  - Set = KEINE doppelten Elemente enthalten.
	 *  - Set = Kein Index vorhanden
	 * Erstellung, Befüllen, Ausgeben
	 * 
	 */
	public static void arbeitenMitHashSet() {
		HashSet<String> artikel = new HashSet<>();
		
		artikel.add("Java Buch");
		artikel.add("Python Buch");
		artikel.add("Dinsey Film");
		System.out.println(artikel);
	}
	
	/**
	 * Tree Map - Sortiert nach dem Key
	 * Tree Map - Sortierung umdrehen mit Comparator.reverseOrder()
	 *  - Map = Key/Value Paare
	 *  - Map = Einfacher Zugriff über den Key
	 *  Erstellung, Befüllen, Ausgeben
	 */
	public static void arbeitenMitTreeMap() {
		TreeMap<Integer, String> kunden = new TreeMap<>();
		
		kunden.put(61, "Peter");
		kunden.put(25, "Klaus");
		kunden.put(42, "Max");
		System.out.println(kunden);
		
		kunden.put(61, "Harald");
		System.out.println(kunden);
		
		kunden.remove(25);
		System.out.println(kunden);
		
		System.out.println(kunden.get(42));
		
		System.out.println(kunden.keySet());
		System.out.println(kunden.values());
	}
	
	/**
	 * Hash Map - Keine automatische Sortierung
	 *  - Map = Key/Value Paare
	 *  - Map = Einfacher Zugriff über den Key
	 *  Erstellung, Befüllen, Ausgeben
	 */
	public static void arbeitenMitHashMap() {
		HashMap<String, String> hauptstaedte = new HashMap<>();
		
		hauptstaedte.put("England", "London");
		hauptstaedte.put("Norwegen", "Oslo");
		hauptstaedte.put("USA", "Washington DC");
		
		System.out.println(hauptstaedte);
	}
}
