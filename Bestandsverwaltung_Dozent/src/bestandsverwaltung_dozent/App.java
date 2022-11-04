package bestandsverwaltung_dozent;

import bestandsverwaltung_dozent.model.Address;
import bestandsverwaltung_dozent.model.MotorVehicle;

public class App {

	public static void main(String[] args) {
		/*
			Höhe x Breite x Tiefe = 300 cm x 150 cm x 150 cm
Gewicht = 1300 kg
Automarke = JEEP
Startadresse: Autohersteller, Autoplatz 1, 11111 Autostadt
Zieladresse: Eva Musterautohaus, Milchstraße 14, 90234 Galazien

		Höhe x Breite x Tiefe = 350 cm x 130 cm x 130 cm
		Gewicht = 1100 kg
		Automarke = SPORTSCAR
		Startadresse: Autohersteller, Autoplatz 1, 11111 Autostadt
		Zieladresse: Luca Musterautohaus, Spielstraße 15, 76543 Bretterbach

		Höhe x Breite x Tiefe = 453 cm x 178 cm x 150 cm
		Gewicht = 1400 kg
		Startadresse: Autohersteller, Autoplatz 1, 11111 Autostadt
		Zieladresse: Peter Musterautohaus, Marktplatz 2, 80888 München
		 */
		Address autohersteller = new Address("","Autohersteller", "Autoplatz", "1", "11111", "Autostadt");
		Address evaAutohaus = new Address("Eva", "Musterautohaus", "Milchstraße", "14", "90234", "Galazien");
		Address lucaAutohaus = new Address("Luca", "Musterautohaus", "Spielstraße", "15", "76543", "Bretterbach");
		Address peterAutohaus = new Address("Peter", "Musterautohaus", "Marktplatz", "2", "80888", "München");
		Address beispielMitZero = new Address("Max", "Mustermann", "Musterweg", "42", "01111", "Musterdorf");
		
		autohersteller.printAddress();
		beispielMitZero.printAddress();
		
		MotorVehicle jeep = new MotorVehicle(new double[]{300, 150, 150}, 1300, "JEEP", false, autohersteller, evaAutohaus);
		MotorVehicle sportscar = new MotorVehicle(new double[]{350, 130, 130}, 1100, "SPORTSCAR", false, autohersteller, lucaAutohaus);
		MotorVehicle auto = new MotorVehicle(new double[]{453, 178, 150}, 1400, "", false, autohersteller, peterAutohaus);
		
		jeep.printMotorVehicle();
		sportscar.printMotorVehicle();
		auto.printMotorVehicle();
	}

}
