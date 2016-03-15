import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzbuzzTest {

	@Test
	public void test() {
		String result = fizzbuzz.fizzbuzzMethod(5);
		assertEquals("Buzz", result);		
	}

	@Test
	public void testFizz() {
		String result = fizzbuzz.fizzbuzzMethod(3);
		assertEquals("Fizz", result);		
	}
	@Test
	public void testFizzBuzz() {
		String result = fizzbuzz.fizzbuzzMethod(15);
		assertEquals("FizzBuzz", result);		
	}
	
	@Test
	public void testFizzBuzzNotInteger() {
		String result = fizzbuzz.fizzbuzzMethod(16);
		assertEquals("16", result);		
	}
}
