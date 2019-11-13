import junit.framework.TestCase;
import lab4.OurJulianDate;

public class ADTtest extends TestCase {

	public void testCalcJD() {
		OurJulianDate ourJulia1 = new OurJulianDate();
        assertEquals(2450449, ourJulia1.calcJD(31, 12, 1996, false));
        assertEquals(2451606, ourJulia1.calcJD(31, 2, 2000, false));
        assertEquals(0, ourJulia1.calcJD(23, 11, -4713, true));
        assertEquals(1721485, ourJulia1.calcJD(29, 2, 1, true));
	}

}