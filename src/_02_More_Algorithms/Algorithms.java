package _02_More_Algorithms;

import java.util.List;
import java.util.Random;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equalsIgnoreCase("cracked")) {
				return i;
			}

		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		Double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (longest.length() < words.get(i).length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		boolean isInOrder = false;
		while (isInOrder == false) {
			isInOrder = true;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i + 1) < results.get(i)) {
					double swap = results.get(i + 1);
					results.set(i + 1, results.get(i));
					results.set(i, swap);
					isInOrder = false;

				}

			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		String swap = "";
		boolean isInOrder = false;
		while (isInOrder == false) {
			for (int i = 0; i < unsortedSequences.size()-1; i++) {
				isInOrder = true;
				if (unsortedSequences.get(i).length() > unsortedSequences.get(i + 1).length()) {
					swap = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(i + 1));
					unsortedSequences.set(i + 1, swap);
				}
			}
		}
		return unsortedSequences;
	}
}