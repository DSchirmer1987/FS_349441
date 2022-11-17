package beispiele_junit_dozent.myTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import beispiele_junit_dozent.myClasses.Numbers;

/*
 * @RunWith(Parameterized.class)
 * Wird benötigt um mehrere Parameter an eine Methode zu binden.
 * Also die Test Methode mehrmals ausführen
 */
@RunWith(Parameterized.class)
class NumbersTest {

	/*
	 *  Parametisierten Test
	 *  
	 *  Annotation:
	 *  @ParameterizedTest
	 *  @ValueSource(array/quelle)
	 *  Führt die angegeben Testmethode für jedes gegebene Value aus!
	 */
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,15, Integer.MAX_VALUE})
	public void oddTest(int number) {
		assertTrue(Numbers.isOdd(number));
	}
	
	/*
	 * Parametisierter Test - weitere Version mit angaben der Parameter
	 * @Parameter(zahl)
	 */
	@Parameter(0)
	public int p1;
	@Parameter(1)
	public int p2;
	@Parameter(2)
	public int result;
	
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][] {{1,2,5},{5,3,15},{3,4,122}};
		return Arrays.asList(data);
	}
	
	@Test
	public void testMultiply() {
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(result);
		assertEquals("Result" , result, Numbers.multiply(p1, p2));
	}

}
