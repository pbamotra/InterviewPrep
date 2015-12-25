package com.pbamotra.eopi.trees;

import com.pbamotra.datastructures.TreeNode;

public class HasPathSum {
	public boolean check(TreeNode root, int start_sum, int target) {
		if(root == null)
			return false;
		
		start_sum += root.value;
		if(!root.hasLeftChild() && !root.hasRightChild()) {
			return start_sum == target;
		}
		
		return check(root.left, start_sum, target) || check(root.right, start_sum, target);
	}
	
	/*public static void main(String[] args) {
		TreeNode root 	= new TreeNode(1);
		root.left 	  	= new TreeNode(-1);
		root.right    	= new TreeNode(10);
		root.left.left	= new TreeNode(4);
		root.right.right= new TreeNode(11);
		root.right.left = new TreeNode(9);
		
		root.print();
		System.out.println(check(root, 0, 20));
	}*/
}
