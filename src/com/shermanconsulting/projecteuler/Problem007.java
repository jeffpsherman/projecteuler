/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shermanconsulting.projecteuler;

import com.shermanconsulting.projecteuler.mathUtils.Primes;

/**
 *By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * @author sherman
 */
public class Problem007 {
    public static void main(String[] args) {
	final int nthPrime = 10_001;
	
	Primes primes = new Primes();
	System.out.println(primes.getNthPrime(nthPrime));
    }
}
