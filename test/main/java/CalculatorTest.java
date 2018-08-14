package main.java;

import LearnPackage.Calculator.Calculator;
import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    private Calculator calculator;

    @Rule
    public TestRule timeout = new Timeout(20);

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void calculateSumTest() {
        int expectedResult = 2;
        int actualResult = calculator.calculate("1 + 1");
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void calculateMinusTest() {
        int expectedResult = 20;
        int actualResult = calculator.calculate("25 - 5");
        assertEquals(expectedResult, actualResult);
    }


}
