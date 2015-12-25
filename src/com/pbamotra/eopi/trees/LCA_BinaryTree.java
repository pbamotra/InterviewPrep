package com.pbamotra.eopi.trees;

import com.pbamotra.datastructures.TreeNode;

public class LCA_BinaryTree {
	
	static public TreeNode findLCA(TreeNode root, int n1, int n2) {
		if(root == null)
			return null;
		
		if(root.value == n1 || root.value == n2)
			return root;
		
		TreeNode leftLCA = findLCA(root.left, n1, n2);
		TreeNode rightLCA = findLCA(root.right, n1, n2);
		
		if(leftLCA != null && rightLCA != null)
			return root;
		
		return leftLCA != null ? leftLCA : rightLCA;
	}
	
	/* public static void main(String[] args) {
		TreeNode root 	= new TreeNode(1);
		root.left 	  	= new TreeNode(-1);
		root.right    	= new TreeNode(10);
		root.left.left	= new TreeNode(4);
		root.right.right= new TreeNode(11);
		root.right.left = new TreeNode(9);
		
		System.out.println(findLCA(root, 10, 4).value);
	} */
}
