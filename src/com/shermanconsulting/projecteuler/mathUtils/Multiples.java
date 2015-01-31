package com.shermanconsulting.projecteuler.mathUtils;

public class Multiples {

	public static long leastCommonDenominator(final long start, final long end) {
		long product = 1;
		for (long x = start; x<=end; x++) {
			product *= x;
		}
		return product;
	}
	
	/**
	 * There's a lot of room for optimization here - for ex, you can skip
	 * and number that has a higher multiple.
	 * 
	 * ex if testing 1-10 you can skip 2 & 5 because they are multiples of 10,
	 * and 3 because you are testing 6 & 9
	 * And you can always skip 1
	 * @param value
	 * @param start
	 * @param end
	 * @return
	 */
	public static boolean isCommonMultiple(final long value, final long start, final long end) {
		for (long x = start; x<=end; x++) {
			if (value % x != 0) {
				return false;
			}
		}
		return true;
	}
}
