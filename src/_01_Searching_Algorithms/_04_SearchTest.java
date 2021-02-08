package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] linear = {"a","b","c","d","e","f"};
		assertEquals(3,_00_LinearSearch.linearSearch(linear, "d"));
		assertEquals(-1,_00_LinearSearch.linearSearch(linear, "l"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] binary = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		assertEquals(9,_01_BinarySearch.binarySearch(binary, 0,binary.length-1,10));
		assertEquals(-1,_01_BinarySearch.binarySearch(binary, 0,binary.length-1,17));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] interpolation = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		assertEquals(3,_02_InterpolationSearch.interpolationSearch(interpolation, 4));
		assertEquals(-1,_02_InterpolationSearch.interpolationSearch(interpolation, 17));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] exponential = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		assertEquals(3,_03_ExponentialSearch.exponentialSearch(exponential, 4));
		assertEquals(-1,_03_ExponentialSearch.exponentialSearch(exponential, 17));
	}
}
