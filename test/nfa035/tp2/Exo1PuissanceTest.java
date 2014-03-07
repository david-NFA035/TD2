package nfa035.tp2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exo1PuissanceTest {

	@Test(timeout=1000)
	public void testPuissanceNormale() {
		assertEquals("2 puissance 1 = 2", 2.0, Exo1Puissance.puissance(2, 1), 1e-5);
		assertEquals("2 puissance 3 = 8", 8.0, Exo1Puissance.puissance(2, 3), 1e-5);
		assertEquals("10 puissance 6 = 1000000", 1000000.0, Exo1Puissance.puissance(10, 6), 1e-5);
	}

	@Test(timeout=1000)
	public void testPuissance0() {
		assertEquals("2 puissance 0 = 1", 1.0, Exo1Puissance.puissance(2, 0), 1e-5);
	}

	@Test(timeout=1000)
	public void test0Puissance0() {
		assertEquals("0 puissance 0 = 1", 1.0, Exo1Puissance.puissance(0, 0), 1e-5);
	}

	@Test(timeout=1000)
	public void testPuissanceNegative() {
		assertEquals("2 puissance -1", 0.5, Exo1Puissance.puissance(2, -1), 1e-5);
	}
	
	@Test(timeout=1000)
	public void testPuissanceParite() {
		assertEquals("-2 puissance 2", 4, Exo1Puissance.puissance(-2, 2), 1e-5);
	}
	
	@Test(timeout=1000)
	public void testPuissanceNegativeImpaireNombreNegatif() {
		assertEquals("-2 puissance -1", -0.5, Exo1Puissance.puissance(-2, -1), 1e-5);
	}
		
	@Test(timeout=1000)
	public void testPuissanceNegativePaireNombreNegatif() {
		assertEquals("-2 puissance -2", 0.25, Exo1Puissance.puissance(-2, -2), 1e-5);
	}
	
	@Test(expected=ArithmeticException.class, timeout=1000)
	public void testException() {
		double r= Exo1Puissance.puissance(0, -1);		
	}
	

}
