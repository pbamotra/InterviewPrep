package com.pbamotra.eopi.arrays;

public class Sqrt {
	public double calculate(int number) {
		double squareRoot = number / 2;
		double t;
		
		do {
			t = squareRoot;
			squareRoot = (t + number / t) / 2.0;
		} while((t - squareRoot) != 0);
		
		return squareRoot;
	}
}
