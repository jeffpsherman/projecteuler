/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shermanconsulting.projecteuler;

import com.shermanconsulting.projecteuler.mathUtils.Powers;

/**
 *  A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 * @author sherman
 */
public class Problem009 {

    //This is probably the most inefficient way to do this...
    public static void main(String[] args) {
	final int sum = 1000;
	for (int a = 0; a < sum/3; a++) { // a + b + c = sum so a can't be more than 1/3 sum
	    int maxB = (sum - a)/2;	    //b can't be more than half of sum-a
	    for (int b = a + 1; b < maxB; b++ ) { 
		int c = sum - a - b;
		if (Powers.pythagoreanTriplet(a, b, c)) {
		    System.out.println("a=" + a + ", b=" + b + ", c=" + c + " product=" +(a * b * c));
		    System.exit(0);
		}
	    }
	}
	System.out.println("Failed...");
    }
    
}
