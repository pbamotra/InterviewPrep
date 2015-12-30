package com.pbamotra.ctci.recursion;

public class BalancedBrackets {
	private void _print(int nleft, int nright, String str) {
		if(nleft == 0 && nright == 0) 
			System.out.println(str);
		if(nleft > nright)
			return;
		if(nleft > 0)
			_print(nleft-1, nright, str + "(");
		if(nright > 0)
			_print(nleft, nright-1, str + ")");
	}
	
	public void print(int n) {
		if (n%2 != 0) return;
		_print(n/2, n/2, "");
	}
	
	/*public static void main(String[] args) {
		print(6);
	}*/
}
