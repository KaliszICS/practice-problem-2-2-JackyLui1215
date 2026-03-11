/**
 * File: More Functions 
 * Author: Jacky Lui
 * Date Last Modified: Mar 11, 2026
 */


public class PracticeProblem {

	public static void main(String args[]) {
	
	}

	public static boolean isEven(int number) {
		boolean bool = ((number % 2) == 0);
		return bool;
		
	}

	public static boolean isOdd(int number) {
		boolean bool = ((number % 2) != 0);
		return bool;
	}

	public static boolean isPositive(int number) {
		boolean positive = ((number > 0));
		return positive;
	}

	public static boolean isNegative(int number) {
		boolean negative = (number < 0);
		return negative;
	}

	public static int combinedLength(String word1, String word2) {
		int length = ((word1.length()) + word2.length());
		return length;
	}



}
