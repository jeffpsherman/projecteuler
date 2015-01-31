package com.shermanconsulting.projecteuler.problem1;

import java.util.ArrayList;
import java.util.List;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * @author sherman
 *
 */
public class Problem1 {

	public static void main(String[] args) {
		final List<Long> roots = new ArrayList<>();
		roots.add(3l);
		roots.add(5l);
		final long upperBound = 1000;
		
		MatchingMultiples slow = new SlowAndSimple();
		long start = System.nanoTime();
		long sum = slow.sumOfMatchingMultiples(roots, upperBound);
		long end = System.nanoTime();
		System.out.println("Slow = " + sum + " | Time=" + (end-start));
	}

	
}
