package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {

	public static int recursiveMultiplication(int number, int times) {
		// 2. if times is 1
		if (times == 1) {
			return number;
		} else {
			return number + recursiveMultiplication(number, times - 1);
		}
		// 3. return number

		// 4. else return number + recursionMultiplication(number, times-1)

	}

	// 6. Try this one on your own!
	// Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDevideBy) {
	if (number>0) {
		return 1 + recursiveDivision(number-numberToDevideBy, numberToDevideBy);
	}else {
		return 0;
	}
	}

	// 8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		if (power==1) {
			return number;
		}else {
			
			return number*recursivePower(number,power-1);
		}

	}

	@Test
	public void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		// 1 Add more JUnit tests like the one above to test your method
		assertEquals(16, recursiveMultiplication(4, 4));
		assertEquals(1, recursiveMultiplication(1, 1));
		assertEquals(4, recursiveMultiplication(2, 2));
		assertEquals(15, recursiveMultiplication(3, 5));
	}

	@Test
	public void testDivision() {
		// 5 Add JUnit tests to test your method
		assertEquals(4, recursiveDivision(16, 4));
		assertEquals(1, recursiveDivision(1, 1));
		assertEquals(2, recursiveDivision(4, 2));
		assertEquals(3, recursiveDivision(15, 5));
	}

	@Test
	public void testPower() {
		// 7 Add JUnit tests to test your method
		assertEquals(27, recursivePower(3, 3));
		assertEquals(8, recursivePower(2, 3));
		assertEquals(1, recursivePower(1, 26));
		assertEquals(2, recursivePower(2, 1));
	}

}
