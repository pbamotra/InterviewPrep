package com.pbamotra.eopi.trees;

import com.pbamotra.datastructures.TreeNode;

public class LCA_BST {
	
	public static TreeNode findLCA(TreeNode root, int n1, int n2) {
		if(root == null) 
			return root;
		
		if(root.value > n1 && root.value > n2) {
			return findLCA(root.left, n1, n2);
		}
		
		if(root.value < n1 && root.value < n2) {
			return findLCA(root.right, n1, n2);
		}
		
		return root;
	}
	
	public static TreeNode createBST(int[] nums) {
		TreeNode root = null;
		
		for(int n : nums) {
			root = TreeSort.insertBST(root, n);
		}
		
		return root;
	}
	
	/* public static void main(String[] args) {
		int[] nums = new int[] {4,1,5,3,2,0};
		TreeNode root = createBST(nums);
		System.out.println(findLCA(root, 1, 5).value);
	} */
}
