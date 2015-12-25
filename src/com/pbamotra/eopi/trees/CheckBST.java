package com.pbamotra.eopi.trees;

import com.pbamotra.datastructures.TreeNode;

public class CheckBST {
	public boolean check(TreeNode root) {
		if(root == null)
			return true;
		
		if(root.left != null && root.left.value > root.value)
			return false;
		
		if(root.right != null && root.right.value <= root.value)
			return false;
		
		if(!check(root.left) || !check(root.right))
			return false;
		
		return true;
	}
	
	/*public static void main(String[] args) {
		int[] arr = new int[] {0, 1, 1, -1, -99, 1, 4, 1, 90, 100, 4};
		TreeNode bst = LCA_BST.createBST(arr);
		
		System.out.println(check(bst));
		
		TreeNode root 	= new TreeNode(1);
		root.left 	  	= new TreeNode(-1);
		root.right    	= new TreeNode(10);
		root.left.left	= new TreeNode(4);
		root.right.right= new TreeNode(11);
		root.right.left = new TreeNode(9);
		
		System.out.println(check(root));
	}*/
}
