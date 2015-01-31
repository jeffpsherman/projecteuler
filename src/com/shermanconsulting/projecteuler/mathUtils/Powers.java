package com.shermanconsulting.projecteuler.mathUtils;

public class Powers {

	public static long sumOfSquares(final int start, final int end) {
		long sum = 0;
		for (int x = start; x <= end; x++) {
			sum += (x * x);
		}
		return sum;
	}
	
	public static long squareOfSums(final int start, final int end) {
		long sum = 0;
		for (int x = start; x <= end; x++) {
			sum+=x;
		}
		return sum * sum;
	}
	
}
