package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    @Test
    public void testAddNumber() {
        Calculator calculator = new Calculator(10, 20);
        assertEquals(30, calculator.addNumber());
    }
}