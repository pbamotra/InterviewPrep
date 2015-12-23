package com.pbamotra.eopi;

public class GeneratePermutations {
	
	public void permute(String s) {
		permute("", s);
	}
	
	public int dict(String str) {
		switch(str) {
			case "a":
				return 1;
			case "b":
				return 2;
			case "c":
				return 3;
		}
		
		return -1;
	}
	
	void permute(String prefix, String s) {
		int N = s.length();
		if(N == 0)  System.out.println(prefix);
		else {
			for(int i=0; i<N; i++)
				permute(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N));
		}
	}
}
