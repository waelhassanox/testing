package testingtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestMain {

	@Test
	public void testAddingTwoNumber() {
		final int expected = 10;
		final int actual = Main.addTwoNumbers(5, 5);
		assertEquals(expected, actual);
	}
	
}
