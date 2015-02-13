/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shermanconsulting.projecteuler.mathUtils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sherman
 */
public class Primes {
    
    /**
     * Inefficient brute force method 
     * @param check
     * @return 
     */
    public static boolean simpleIsPrime(final long check) {
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
    
    private final List<Long> knownPrimes;
    
    public Primes() {
	knownPrimes = new ArrayList<>();
	knownPrimes.add(2l);
	knownPrimes.add(3l);
    }
    
    public boolean isPrime(final long check) {
	for (long prime : knownPrimes) {
	    if (check % prime == 0) {
		return false;
	    }
	}
	long maxPrime = knownPrimes.get(knownPrimes.size()-1);
	long sqrRoot = (long)Math.sqrt(check);
	for (long x = maxPrime + 2; x <= sqrRoot; x+=2) {
	    if (check % x == 0) {
		return false;
	    }
	}
	System.out.println("Adding prime: " + check);
	knownPrimes.add(check);
	return true;
    }
    
    public int knownPrimeCount() {
	return knownPrimes.size();
    }
    
    private long findNthPrime(final int n) {
	long nextPrime = 2 + knownPrimes.get(knownPrimes.size() -1);
	while (knownPrimeCount()<n) {
	    while (!isPrime(nextPrime)) {
		nextPrime+=2;
	    }
	}
	return nextPrime;
    }
    
    private void findPrimesBelow(final long n) {
	long nextPrime = 2 + knownPrimes.get(knownPrimes.size() -1);
	while (nextPrime < n) {
	    while (!isPrime(nextPrime)) {
		nextPrime+=2;
	    }
	}
    }
    
    public long getNthPrime(final int n) {
	if (n > knownPrimeCount()) {
	    return findNthPrime(n);
	}
	return knownPrimes.get(n-1);
    }
    
    public List<Long> getPrimesBelow(final long n) {
	findPrimesBelow(n);
	List<Long> subPrimes = new ArrayList();
	for (Long prime : knownPrimes) {
	    if (prime < n) {
		subPrimes.add(prime);
	    }
	}
	return subPrimes;
    }
}
