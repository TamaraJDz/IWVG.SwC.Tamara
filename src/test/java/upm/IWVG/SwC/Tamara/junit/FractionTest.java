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

}
