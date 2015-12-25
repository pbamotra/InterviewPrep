package com.pbamotra.eopi.trees;

import com.pbamotra.datastructures.TreeNode;

public class FindKeyBST {
	public static TreeNode find(TreeNode root, int target) {
		if(root == null)
			return null;
		
		if(root.value == target)
			return root;
		
		if(root.value < target)
			return find(root.right, target);
		else
			return find(root.left, target);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {0, 1, 1, -1, -99, 1, 4, 1, 90, 100, 4};
		TreeNode bst = LCA_BST.createBST(arr);
		
		int key = 4;
		TreeNode found = find(bst, key);
		if(found != null) {
			System.out.println(found.value);
		} else {
			System.out.printf("%d not found\n", key);
		}
		
	}
}
