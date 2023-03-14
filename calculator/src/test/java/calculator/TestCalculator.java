package calculator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {

    private static final double DELTA = 1e-15;
    Calculator cal;

    @Before
    public void init()
    {
        cal = new Calculator();
    }

    @Test
    public void squareRootTruePositive()
    {
        assertEquals("Square Root Test 1", 2, cal.mySqrt(4), DELTA);
        assertEquals("Square Root Test 2", 3, cal.mySqrt(9), DELTA);
        assertEquals("Square Root Test 3", 9, cal.mySqrt(81), DELTA);
        assertEquals("Square Root Test 4", 1.4142135623730951, cal.mySqrt(2), DELTA);
    }

    @Test
    public void squareRootFalsePositive()
    {
    	assertNotEquals("Square Root Test 1", 1, cal.mySqrt(4), DELTA);
    	assertNotEquals("Square Root Test 2", 2, cal.mySqrt(9), DELTA);
    	assertNotEquals("Square Root Test 3", 2, cal.mySqrt(15), DELTA);
    	assertNotEquals("Square Root Test 4", 2, cal.mySqrt(20), DELTA);
    }

    @Test
    public void factorialTruePositive()
    {
        assertEquals("Factorial Test 1", 1, cal.myFactorial(0), DELTA);
        assertEquals("Factorial Test 2", 1, cal.myFactorial(1), DELTA);
        assertEquals("Factorial Test 3", 2, cal.myFactorial(2), DELTA);
        assertEquals("Factorial Test 4", 6, cal.myFactorial(3), DELTA);
    }

    @Test
    public void factorialFalsePositive()
    {
    	assertNotEquals("Factorial Test 1", 0, cal.myFactorial(0), DELTA);
    	assertNotEquals("Factorial Test 2", 0, cal.myFactorial(1), DELTA);
        assertNotEquals("Factorial Test 3", 1, cal.myFactorial(2), DELTA);
        assertNotEquals("Factorial Test 4", 3, cal.myFactorial(3), DELTA);
    }

    @Test
    public void logTruePositive()
    {
        assertEquals("Log Test 1", 2.302585092994046, cal.myLog(10), DELTA);
        assertEquals("Log Test 2", 4.605170185988092, cal.myLog(100), DELTA);
        assertEquals("Log Test 3", 0, cal.myLog(1), DELTA);
    }

    @Test
    public void logFalsePositive()
    {
    	assertNotEquals("Log Test 1", 2, cal.myLog(10), DELTA);
    	assertNotEquals("Log Test 2", 4, cal.myLog(100), DELTA);
    	assertNotEquals("Log Test 3", 1, cal.myLog(1), DELTA);
    }

    @Test
    public void powerTruePositive()
    {
        assertEquals("Power Test 1", 4, cal.myPow(2, 2), DELTA);
        assertEquals("Power Test 2", 125, cal.myPow(5, 3), DELTA);
        assertEquals("Power Test 3", 3, cal.myPow(3, 1), DELTA);
        assertEquals("Power Test 4", 1, cal.myPow(10, 0), DELTA);
    }

    @Test
    public void powerFalsePositive()
    {
    	assertNotEquals("Power Test 1", 10, cal.myPow(2, 2), DELTA);
    	assertNotEquals("Power Test 2", 5, cal.myPow(5, 3), DELTA);
    	assertNotEquals("Power Test 3", 0, cal.myPow(3, 1), DELTA);
    	assertNotEquals("Power Test 4", 10, cal.myPow(10, 0), DELTA);
    }

}
