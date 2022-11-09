package beispiele_dateizugriff_dozent.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class DateiVerwaltung {
	private String fileName;
	private String inhalt;
	private Path filePath;
	
	public DateiVerwaltung(String fileName, String inhalt) {
		this.fileName = fileName;
		this.inhalt = inhalt;
		
		/*
		 * Pfad setzen
		 * 
		 * Path ist ein Interface - kein new Möglich
		 * 
		 * Paths - Hilfs/Utility Klasse zum arbeiten mit Pfaden.
		 * 
		 * Paths.get() - Gibt ein Pfad-Objekt zurück
		 * 
		 * Wichtig für Pfadangaben:
		 * 	Betriebssystemspezifischen Bedingung beachten
		 *  	- Windows : Laufwerk:\Ordner
		 *  	- Unix/Linux : Ordner/Ordner
		 *  Lese/Schreibrechte beachten
		 *  
		 *  Empfehlenswert - User-Home Verzeichnis
		 *  	- Windows: C:\Users\Username\
		 *  	- Unix/Linux: /home/username/
		 *  in Java:
		 *  	- Sytem.getProperty("user.home") : Gibt das User-Home Verzeichnis zurück
		 */
		String userHome = System.getProperty("user.home");
		filePath = Paths.get(userHome + "/" + fileName);
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	@Override
	public String toString() {
		return "DateiVerwaltung [fileName=" + fileName + ", inhalt=" + inhalt + ", filePath=" + filePath + "]";
	}
	
	public void schreibeInDatei() {
		/*
		 * Schreiben in eine Datei
		 * 
		 * Files
		 *  - Bietet Methoden für die Arbeit mit Dateien an.
		 *  - Beinhaltet 
		 *  	- automatisch die Überprüfung der Lese/Schreibrechte
		 *  	- Erstellt, wenn nicht vorhanden, die Datei
		 *  
		 *  - writeString(Path, String) zum Schreiben von Strings in Dateien.
		 *  
		 *  - writeString(Path, String, Options[]) - Schreiben von Strings mit speziallen Angaben
		 *  	- Mögliche Angaben:
		 *  		StandardOpenOption.CREATE
		 *  		StandardOpenOption.APPEND
		 *   	-!WICHTIG!
		 *   		- Wenn APPEND genutzt werden soll MUSS! auch CREATE gesetzt werden
		 *   			da ansonsten die Datei nicht erstellt wird, wenn nicht vorhanden
		 */
		try {
			Files.writeString(filePath, inhalt, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void leseAusDatei() {
		try {
			String gelesen = Files.readString(filePath);
			System.out.println("Aus Datei gelesen: " + System.lineSeparator()  + gelesen);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
