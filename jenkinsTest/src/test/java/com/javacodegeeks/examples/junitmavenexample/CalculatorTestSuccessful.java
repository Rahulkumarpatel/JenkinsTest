package com.javacodegeeks.examples.junitmavenexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTestSuccessful {

	private static ICalculator calculator;

	@BeforeClass
	public static void initCalculator() {  
		calculator = new Calculator();
	}

	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);
		assertEquals(7, result);
	}

	@Test
	public void testDivison() {
		try {  
			int result = calculator.divison(10, 2);
			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.divison(10, 0);
	}

	@Test()
	public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);
		assertTrue(result);
	}

	@Test
	public void testSubstraction() {
		int result = 10 - 3;
		assertTrue(result == 7);
	}
}