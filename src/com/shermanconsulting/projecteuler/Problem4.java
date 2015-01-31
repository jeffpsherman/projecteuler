package com.shermanconsulting.projecteuler;

import com.shermanconsulting.projecteuler.mathUtils.Palindrome;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit 
 * numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * @author sherman
 *
 */
public class Problem4 {

	public static void main(String[] args) {
		int digits = 3;
		long maxPalindrome = 0;
		long max = (long)Math.pow(10, digits);
		for (long maxX = max -1; maxX > 0; maxX--) {
			long maxY = maxX;
			while (maxY > 0) {
				long check = maxX * maxY;
				if (Palindrome.isPalindrome(check) && check > maxPalindrome) {
					maxPalindrome = check;
				}
				maxY--;
			}
		}
		System.out.println(maxPalindrome);
	}

}
