package beispiele_junit_dozent.myTests;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import beispiele_junit_dozent.myClasses.Rechner;

class RechnerTest {
	private Rechner rechner;
	
	/*
	 * Steuerungs-Annotations
	 * 
	 * @Before - Wird zuerst ausgeführt - Ältere Variante, nicht verlässlich
	 * @BeforeEach - Wird vor jedem Test ausgeführt
	 * 
	 * @Test - Der Test / Die Testmethode
	 */
	
	@BeforeEach
	public void setUp() {
		rechner = new Rechner(7, 14);
	}
	
	/*
	 * Testmethode:
	 * Testen unsere Annahme im Vergleich mit der Realität
	 * 
	 * assert = Annahme
	 * assertEquals = Annahme gleich dem Ergebnis
	 * assertEquals (Annahme, Realität)
	 */
	@Test
	public void testAddition() {
		assertEquals(7+14, rechner.addiere());
	}
	
	@Test
	public void testSubtraktion() {
		assertEquals(7-14, rechner.subtrahiere());
	}
	
	@Test
	public void testMultiplikation() {
		assertEquals(7*14, rechner.multipliziere());
	}
	
	@Test
	public void testDivision() {
		assertEquals(7/14, rechner.dividiere());
	}
}
