package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {
    ScientificCalculator calculator = new ScientificCalculator();

    @Test
    public void testSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9), 0.0001);
    }

    @Test
    public void testSquareRootNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-4);
        });
        assertEquals("Cannot compute square root of a negative number.", exception.getMessage());
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-3);
        });
        assertEquals("Factorial is not defined for negative numbers.", exception.getMessage());
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0, calculator.naturalLog(1), 0.0001);
    }

    @Test
    public void testNaturalLogNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.naturalLog(-1);
        });
        assertEquals("Natural logarithm is only defined for positive numbers.", exception.getMessage());
    }

    @Test
    public void testPower() {
        assertEquals(8, calculator.power(2, 3), 0.0001);
    }
}
