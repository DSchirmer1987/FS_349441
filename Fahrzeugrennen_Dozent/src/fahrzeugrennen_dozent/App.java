package fahrzeugrennen_dozent;

import java.util.Arrays;

import fahrzeugrennen_dozent.model.Auto;
import fahrzeugrennen_dozent.model.Fahrrad;
import fahrzeugrennen_dozent.model.Krankenwagen;
import fahrzeugrennen_dozent.model.Rennwagen;

public class App {

	public static void main(String[] args) {
		Fahrrad fahrrad = new Fahrrad();
		Auto auto = new Auto();
		Rennwagen rennwagen = new Rennwagen();
		Krankenwagen krankenwagen = new Krankenwagen();
		
		fahrrad.setGeschwindigkeit(20);
		auto.setGeschwindigkeit(150);
		rennwagen.setGeschwindigkeit(200);
		krankenwagen.setGeschwindigkeit(80);
		
		fahrrad.bewege(240);
		
		fahrrad.bewege(60);
		auto.bewege(60);
		rennwagen.bewege(60);
		krankenwagen.bewege(60);
		
		// Tipp: syso -> strg + leer | Zum schnellen einfügen von System.out.println() für Ausgaben
		System.out.println("Fahrrad: " + fahrrad.getPosition());
		System.out.println("Auto: " + auto.getPosition());
		System.out.println("Rennwagen: " + rennwagen.getPosition());
		System.out.println("Krankenwagen: " + krankenwagen.getPosition());
		
		double[] positionen = new double [] {fahrrad.getPosition(), auto.getPosition(), rennwagen.getPosition(), krankenwagen.getPosition()};
		
		//Arrays = Hilfsklasse in Java für das arbeiten mit Arrays. Zum Beispiel für die Ausgabe als String:
		System.out.println(Arrays.toString(positionen));
		
		Arrays.sort(positionen);
		
		System.out.println(Arrays.toString(positionen));
		
	}

}
