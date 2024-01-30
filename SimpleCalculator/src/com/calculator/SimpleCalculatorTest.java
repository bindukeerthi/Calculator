package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	/*This test method indicates the Addition method
	in SimpleCalculator class of positive scenario*/
	@Test
	public void testAddition() {
		int x=10;
		int y= 20;
		int result = SimpleCalculator.addition(x, y);
		assertEquals(30, result);
	}
	
	/*This test method indicates the Subtraction method
	in SimpleCalculator class of positive scenario*/
	@Test
	public void testSubtraction() {
		int x=10;
		int y= 20;
		int result = SimpleCalculator.subtraction(x, y);
		assertEquals(-10, result);
	}
	
	/*This test method indicates the Division method
	in SimpleCalculator class of positive scenario*/
	@Test
	public void testDivivsion() {
		int x=10;
		int y= 20;
		float result = SimpleCalculator.division(x, y);
		assertEquals(0.5, result);
	}
	
	/*This test method indicates the Multiplication method
	in SimpleCalculator class of negative scenario*/
	@Test
	public void testMultiplication() {
		int x=10;
		int y= 20;
		int result = SimpleCalculator.multiplication(x, y);
		//assertEquals(200, result);
		assertEquals(100, result);
	}

}
