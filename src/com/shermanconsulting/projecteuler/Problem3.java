package com.shermanconsulting.projecteuler;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * @author sherman
 *
 */
public class Problem3 {

	public static void main(String[] args) {
		final long key = 600851475143l;
		//final long key = 13195l;
		long limit = (long)Math.sqrt(key);
		
		if (limit % 2 == 0) {
			limit --;
		}
		
		while (limit >0) {
			if (key % limit == 0 && Problem3.isPrime(limit)) {
				System.out.println(limit);
			}
			limit -=2;
		}
	}
			
	public static boolean isPrime(final long check) {
		if (check % 2 == 0) {
			return false;
		}
		long limit = (long)Math.sqrt(check);
		for (long x = 3; x <= limit; x+=2) {
			if (check % x ==0) {
				return false;
			}
		}
		return true;
	}

}
