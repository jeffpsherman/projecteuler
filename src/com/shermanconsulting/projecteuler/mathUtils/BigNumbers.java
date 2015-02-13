/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shermanconsulting.projecteuler.mathUtils;

/**
 *
 * @author sherman
 */
public class BigNumbers {

    public static byte[] convertStringToBytes(final String digits) {
	byte[] asBytes = new byte[digits.length()];
	byte[] raw = digits.getBytes();
	byte zeroOffset = '0';
	for (int x=0; x< raw.length; x++) {
	    asBytes[x] = (byte)((int)raw[x] - (int)zeroOffset);
	}
	return asBytes;
    }
    
    public static long largestProduct(byte[] digits, int size) {
	long highestProduct = 0;
	
	for (int x=0; x+size < digits.length; x++) {
	    long newVal = digits[x];
	    for (int y = 1; y < size; y++) {
		newVal *= digits[x+y];
	    }
	    if (newVal > highestProduct) {
		highestProduct = newVal;
	    }
	}
	
	return highestProduct;
    }
}
