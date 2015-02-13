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
	
	public static boolean pythagoreanTriplet(final int a, final int b, final int c) {
	    //a < b < c
	    if (!(a<b) || !(b<c)) {
		return false;
	    }
	    long asqr = a * a;
	    long bsqr = b * b;
	    long csqr = c * c;

	    return (asqr + bsqr == csqr);
	}
	
}
