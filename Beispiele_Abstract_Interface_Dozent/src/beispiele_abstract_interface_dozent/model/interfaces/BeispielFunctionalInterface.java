package beispiele_abstract_interface_dozent.model.interfaces;
/*
 * @FunctionalInterface - Erzwingt den Compiler das Interface als functional anzusehen.
 * 
 * d.h. in dem Interface darf es nur EINE abstrakte Methode geben.
 */
@FunctionalInterface 
public interface BeispielFunctionalInterface {
	// eine Abstrakte Methode. Nicht mehr!
	public abstract int berechne(int a, int b);
}
