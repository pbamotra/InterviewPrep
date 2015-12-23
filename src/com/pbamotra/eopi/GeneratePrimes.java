package com.pbamotra.eopi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratePrimes {
	
	boolean isPrime(int num) {
		
		if (num < 2) return false;
		if (num == 2) return true;
		if (num%2 == 0) return false;
		
		for(int i=3; i*i<=num; i+=2) {
			if(num%i == 0) return false;
		}
		
		return true;
	}
	
	public void generate(int n) {
		
		List<Boolean> is_Prime = new ArrayList<>(n);
		List<Integer> primes = new ArrayList<>();
		
		for(int i=0; i<=n; i++) {
			is_Prime.add(true);
		}
		
		is_Prime.set(0, false);
		is_Prime.set(1, false);
		
		for(int i=2; i<n; i++) {
			if(is_Prime.get(i)) {
				primes.add(i);
				
				for(int j=i; j<= n; j+=i) {
					is_Prime.set(j, Boolean.FALSE);
				}
			}
		}
		
		for(Integer i: primes) {
			System.out.print(i + " ");
		}
	}
}
