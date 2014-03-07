package nfa035.tp2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exo2MaximumTest {

	@Test(timeout=1000)
	public void testMaximumSingleton() {
		double [] t = {1};
		assertEquals("maximum du tableau {1}", 1, Exo2Maximum.maximum(t), 1e-5);
	}
	
	@Test(timeout=1000)
	public void testMaximumPositifs() {
		double [] t = {1, 2, 3, 20, 4, 5, 0};
		assertEquals("maximum du tableau {1, 2, 3, 20, 4, 5, 0}", 20, Exo2Maximum.maximum(t), 1e-5);
	}
	
	@Test(timeout=1000)
	public void testMaximumNegatifs() {
		double [] t = {-1, -2, -3, -20, -4, -5};
		assertEquals("maximum du tableau {-1, -2, -3, -20, -4, -5}", -1, Exo2Maximum.maximum(t), 1e-5);
	}
	
	@Test(timeout=1000)
	public void testMaximumMixed() {
		double [] t = {-176654.8876, 277654, -3.88E34, 1.79E53, 0, 1.79E308};
		assertEquals("maximum du tableau {-176654.8876, 277654, -3.88E34, 1.79E53, 0, 1.79E308}", 1.79E308, Exo2Maximum.maximum(t), 1e-5);
	}
	
	@Test(expected=IllegalArgumentException.class, timeout=1000)
	public void testException1() {
		double [] vide = {};
		double r= Exo2Maximum.maximum(vide);		
	}
	
	@Test(expected=NullPointerException.class, timeout=1000)
	public void testException2() {
		double r= Exo2Maximum.maximum(null);		
	}

}
