package com.shermanconsulting.projecteuler.problem1;

import java.util.List;

public class SlowAndSimple implements MatchingMultiples {

	/**
	 * Conceptually easy, but programmatically expensive.
	 * Simply mod by each root
	 */
	@Override
	public long sumOfMatchingMultiples(List<Long> roots, long upperBound) {
		long sum = 0;
		
		for (long check = 1; check < upperBound; check++) {
			for (Long root : roots) {
				if (check % root == 0 ) {
					sum += check;
					break;
				}
			}
		}
		
		return sum;
	}

}
