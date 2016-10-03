package upm.IWVG.SwC.Tamara.junit;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import upm.IWVG.SwC.Tamara.Fraction;

public class FractionTest extends TestCase {

	 private Fraction fr;
		
	    @Before
	    public void setUp() {
	        fr = new Fraction(25, 5);
	    }
		
		@Test
		public void testFractionIntInt() {
			assertEquals(25, fr.getNumerator());
	        assertEquals(5, fr.getDenominator());
		}

		@Test
		public void testFraction() {
			fr = new Fraction();
	        assertEquals(1, fr.getNumerator());
	        assertEquals(1, fr.getDenominator());
		}

		@Test
		public void testDecimal() {
			assertEquals(5, fr.getNumerator() / fr.getDenominator());
		}

		@Test
		public void testGetNumerator() {
			assertEquals(25, fr.getNumerator());
		}

		@Test
		public void testGetDenominator() {
			assertEquals(5, fr.getDenominator());
		}
		
		@Test
		public void testIsImproper() {
			assertTrue(fr.isImproper());
			fr = new Fraction(3, 4);
			assertFalse(fr.isImproper());
		}
		
	    @Test
	    public final void testIsEquivalentFraction() {
	    	Fraction eqfraction = new Fraction(10,2);
	    	assertTrue(fr.isEquivalentFraction(eqfraction));
	    	Fraction noteqfraction = new Fraction(10,3);
	    	assertFalse(fr.isEquivalentFraction(noteqfraction));
	    }
	    
	    @Test
	    public final void testSumFraction(){
	    	fr.sumFraction(new Fraction(1,2));
	    	assertEquals(5.5,fr.decimal(), 10e-5);
	    }

	    @Test
	    public final void testSubtractFraction(){
	    	fr.subtractFraction(new Fraction(1,2));
	    	assertEquals(4.5,fr.decimal(), 10e-5);
	    }
}
