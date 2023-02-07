package ausflug_dozent;

import java.util.Scanner;

public class AusflugPlanung {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Ausflug ausflug = pruefeBedingung();
		System.out.println(erstelleProgramm(ausflug));
	}

	public static String erstelleProgramm(Ausflug ausflug) {
		String programm = "\nVerfuegbare Aktivitaeten:\n";
		if ((ausflug.getWochentag() && !ausflug.getTageszeit()) || (!ausflug.getWochentag())) {
			programm += "Kegeln\n";
		}

		if (ausflug.getWetter() && ausflug.getTageszeit()) {
			programm += "Freibad\n";
		}

		if (!(!ausflug.getWochentag() && ausflug.getSchulferien())) {
			programm += "Hallenbad\n";
		}

		if (ausflug.getWetter() && ausflug.getTageszeit()) {
			programm += "Wandern im Dunkelwald\n";
		}

		if (!ausflug.getTageszeit() && !ausflug.getSchulferien()) {
			programm += "Freikurs Musik\n";
		}

		if (!ausflug.getWochentag() && !ausflug.getWetter()) {
			programm += "Brotbackkurs\n";
		}

		if (ausflug.getTageszeit() || (!ausflug.getWochentag() && ausflug.getSchulferien())) {
			programm += "Schieferbergwerk\n";
		}

		if (!ausflug.getWochentag() && !ausflug.getWetter()) {
			programm += "Go-Kurs (Gemeindelokal Raum B4)\n";
		} else if (ausflug.getWochentag() && !ausflug.getTageszeit() && ausflug.getWetter()) {
			programm += "Go-Kurs (Lokal Widder in der Gartenwirtschaft)\n";
		}

		if ((ausflug.getWochentag() && !ausflug.getTageszeit() && !ausflug.getKinder())
				|| (!ausflug.getWochentag() && !ausflug.getKinder())) {
			programm += "Billard\n";
		}

		if (!ausflug.getKinder() && ausflug.getWetter() && !ausflug.getWochentag() && ausflug.getSchulferien()) {
			programm += "Rennautofahren\n";
		}

		if ((ausflug.getWochentag() && !ausflug.getTageszeit() && ausflug.getWetter())
				|| (!ausflug.getWochentag() && ausflug.getWetter())) {
			programm += "Open-Air Kino\n";
		}

		if (ausflug.getSchulferien() && !ausflug.getWetter()) {
			programm += "Korbflechten\n";
		}

		if (ausflug.getTageszeit()) {
			programm += "Besuch des Wasserfalls\n";
		}

		programm += "Zoobesuch";
		return programm;
	}

	public static Ausflug pruefeBedingung() {
		Ausflug ausflug = new Ausflug();
		String antwort;
		System.out.println("Ist heute ein Wochentag? (Y|N)");
		antwort = scan.nextLine();
		ausflug.setWochentag(antwort);

		System.out.println("Ist es tagsueber? (Y|N)");
		antwort = scan.nextLine();
		ausflug.setTageszeit(antwort);

		System.out.println("Ist das Wetter schoen? (Y|N)");
		antwort = scan.nextLine();
		ausflug.setWetter(antwort);

		System.out.println("Sind es Schulferien? (Y|N)");
		antwort = scan.nextLine();
		ausflug.setSchulferien(antwort);

		System.out.println("Kommen Kinder? (Y|N)");
		antwort = scan.nextLine();
		ausflug.setKinder(antwort);

		return ausflug;
	}
}
