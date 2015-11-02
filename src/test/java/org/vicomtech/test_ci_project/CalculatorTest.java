package org.vicomtech.test_ci_project;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIntegerSum() throws Exception {
		Calculator calculator=new Calculator();
		assertEquals(7,calculator.integerSum(4, 3));
		assertEquals(-5,calculator.integerSum(0, -5));
		assertEquals(5,calculator.integerSum(5, 0));
	}

	@Test
		public void testIntegerMult() throws Exception {
			Calculator calculator=new Calculator();
			assertEquals(0,calculator.integerMult(5,0));
			assertEquals(-5,calculator.integerMult(1, -5));
			assertEquals(5,calculator.integerMult(-1, -5));
		}

}
