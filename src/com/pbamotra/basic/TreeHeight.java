package com.pbamotra.basic;

import com.pbamotra.datastructures.TreeNode;

public class TreeHeight {
	public int calculate(TreeNode root) {
		if(root == null)
			return 0;
		else {
			int ldepth = calculate(root.left);
			int rdepth = calculate(root.right);
			
			if(ldepth > rdepth)
				return ldepth + 1;
			else
				return rdepth + 1;
		}
	}
	
	/*public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		root.left  = a;
		root.right = b;
		
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		
		a.left = d;
		b.right = c;
		
		TreeNode e = new TreeNode(5);
		b.left = e;
		
		System.out.println(calculate(root));
	}*/
}
