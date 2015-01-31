package com.shermanconsulting.projecteuler;

import com.shermanconsulting.projecteuler.mathUtils.Multiples;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * @author sherman
 *
 */
public class Problem5 {

	public static void main(String[] args) {
		final int startRange = 1;
		final int endRange = 20;
		
		long lcd = Multiples.leastCommonDenominator(startRange, endRange);
		for (long x = endRange; x < lcd; x++) {
			if (Multiples.isCommonMultiple(x, startRange, endRange)) {
				lcd = x;
			}
		}
		
		System.out.println(lcd);
	}
}
