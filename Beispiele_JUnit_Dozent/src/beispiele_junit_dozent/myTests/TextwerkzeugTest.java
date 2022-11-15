package beispiele_junit_dozent.myTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import beispiele_junit_dozent.myClasses.Textwerkzeug;

class TextwerkzeugTest {
	private Textwerkzeug tw;
	
	@BeforeEach
	public void setUp() {
		tw = new Textwerkzeug("Hallo");
	}
	
	@Test
	public void testUmdrehen() {
		tw.umdrehen();
		assertEquals("ollaH", tw.getAusgabe());
	}
}
