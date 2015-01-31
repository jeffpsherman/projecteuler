package com.shermanconsulting.projecteuler.problem1;

import java.util.List;

public interface MatchingMultiples {

	/**
	 * This is the generalized form of the question, sum any number of roots to any upper bound
	 * @param roots
	 * @param upperBound
	 * @return
	 */
	public long sumOfMatchingMultiples(List<Long> roots, final long upperBound);
}
