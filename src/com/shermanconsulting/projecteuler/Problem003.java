package com.shermanconsulting.projecteuler;

import com.shermanconsulting.projecteuler.mathUtils.Primes;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * @author sherman
 *
 */
public class Problem003 {

	public static void main(String[] args) {
		final long key = 600851475143l;
		//final long key = 13195l;
		long limit = (long)Math.sqrt(key);
		
		if (limit % 2 == 0) {
			limit --;
		}
		
		while (limit >0) {
			if (key % limit == 0 && Primes.simpleIsPrime(limit)) {
				System.out.println(limit);
			}
			limit -=2;
		}
	}
			
	

}
