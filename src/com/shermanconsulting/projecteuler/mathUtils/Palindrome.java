package com.shermanconsulting.projecteuler.mathUtils;

/**
 * Palindrome is a number that reads the same both ways
 * ex: 9009, 90109, etc
 * @author sherman
 *
 */
public class Palindrome {

	public static boolean isPalindrome(final long check) {
		return isPalindrome(check + "");
	}
	
	public static boolean isPalindrome(final String check) {
		if (check == null || check.isEmpty()) {
			return false;
		}
		
		byte[] palindrone = check.getBytes();
		int halfWay = palindrone.length / 2; //If odd length the middle doesn't need to match anything
		for (int x = 0; x <= halfWay; x++) {
			if (palindrone[x]!=palindrone[palindrone.length-x-1]) {
				return false;
			}
		}
		
		return true;
	}
	
}
