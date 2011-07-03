package de.vogella.junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
		assertEquals("Result", 50, tester.multiply(10, 5));
	}
	
	@Test
	public void testSum() {
		MyClass tester = new MyClass();
		assertEquals("Result", 13, tester.sum(9, 4));
	}
	
	@Test
	public void testDivision() {
		MyClass tester = new MyClass();
		assertEquals("Result", 0, tester.division(25));
	}
}
