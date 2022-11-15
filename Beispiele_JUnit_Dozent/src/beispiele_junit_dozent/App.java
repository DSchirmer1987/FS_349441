package beispiele_junit_dozent;

import beispiele_junit_dozent.myClasses.Rechner;
import beispiele_junit_dozent.myClasses.Textwerkzeug;

public class App {

	public static void main(String[] args) {
		Textwerkzeug tw = new Textwerkzeug("Hallo Welt");
		tw.umdrehen(); //tlew ollaH
		System.out.println(tw.getAusgabe());
		tw.umdrehenGross(); //TLEW OLLAH
		System.out.println(tw.getAusgabe());
		manuellTesten();
	}
	
	public static void manuellTesten() {
		Rechner rechner = new Rechner(7, 14);
		System.out.println(rechner.addiere()); //21
		System.out.println(rechner.subtrahiere()); // -7
		System.out.println(rechner.multipliziere()); // 98
		System.out.println(rechner.dividiere()); // 0,5 || 1 0
	}

}
