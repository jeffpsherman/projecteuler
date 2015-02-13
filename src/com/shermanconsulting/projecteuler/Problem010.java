/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shermanconsulting.projecteuler;

import com.shermanconsulting.projecteuler.mathUtils.Primes;
import java.util.List;

/**
 *  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * @author sherman
 */
public class Problem010 {
    
    public static void main(String[] args) {
	int belowVal = 2_000_000;
	Primes primes = new Primes();
	List<Long> subPrimes = primes.getPrimesBelow(belowVal);
	
	long sum = 0;
	for (long prime : subPrimes) {
	    sum +=prime;
	}
	System.out.println(subPrimes.size() + " primes, sum=" + sum);
    }
}
