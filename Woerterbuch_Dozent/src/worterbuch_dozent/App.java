package worterbuch_dozent;

import worterbuch_dozent.model.Dictionary;

public class App {

	public static void main(String[] args) {
		Dictionary woerterbuch = new Dictionary();
		woerterbuch.addGermanWord("Kaffee", "coffee");
		woerterbuch.addGermanWord("Pause", "break");
		woerterbuch.addEnglishWord("Storm", "Sturm");
		woerterbuch.addEnglishWord("firstname", "Vorname");
		
		System.out.println(woerterbuch);
		
		System.out.println(woerterbuch.translateToEnglish("Kaffee"));
		System.out.println(woerterbuch.translateToEnglish("Flugzeug"));
		
		woerterbuch.sortGerman();
		System.out.println(woerterbuch);
		
		woerterbuch.sortEnglish();
		System.out.println(woerterbuch);
	}

}
