package de.vogella.junit.first;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class HummingbirdTest {

	@Test
	public void testGetColor() {
		Hummingbird tester = new Hummingbird(3, 2);
		assertEquals("Result", Color.BLUE, tester.getColor());
	}
	
	@Test
	public void testFly() {
		Hummingbird tester = new Hummingbird(3, 2);
		assertEquals("Result", 21 , tester.fly());
	}
	

	@Test
	public void testGetPosition() {
		Hummingbird tester = new Hummingbird(3, 2);
		assertEquals("Result", 5 , tester.getPosition());
	}
}
