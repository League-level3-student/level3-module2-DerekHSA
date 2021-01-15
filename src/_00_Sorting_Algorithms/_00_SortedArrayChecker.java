package _00_Sorting_Algorithms;

import java.lang.reflect.Array;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise
	static public boolean intArraySorted(int[] uhh) {
		for (int i = 0; i < uhh.length - 1; i++) {
			if (uhh[i + 1] < uhh[i]) {
				return false;
			}
		}
		return true;
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	static public boolean doubleArraySorted(double[] uhh) {

		for (int i = 0; i < uhh.length - 1; i++) {
			if (uhh[i + 1] < uhh[i]) {
				return false;
			}
		}
		return true;

	}

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)
	static public boolean charArraySorted(char[] uhh) {

		for (int i = 0; i < uhh.length - 1; i++) {
			if (uhh[i + 1] < uhh[i]) {
				return false;
			}
		}

		return true;
	}

	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
	static public boolean stringArraySorted(String[] uhh) {
		for (int i = 0; i < uhh.length - 1; i++) {
			if (uhh[i + 1].compareTo(uhh[i]) < 0) {
				return false;
			}
		}

		return true;
	}
}
