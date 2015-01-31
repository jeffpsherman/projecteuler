package com.shermanconsulting.projecteuler;

import com.shermanconsulting.projecteuler.mathUtils.Powers;

/**
 * The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * @author sherman
 *
 */
public class Problem6 {
	
	public static void main(String[] args) {
		final int start = 1;
		final int end = 100;
		
		final long sumOfSquares = Powers.sumOfSquares(start, end);
		final long squareOfSums = Powers.squareOfSums(start, end);
		
		System.out.println(squareOfSums - sumOfSquares);
	}
	
}
