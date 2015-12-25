package com.pbamotra.eopi.trees;

import com.pbamotra.datastructures.TreeNode;

public class TreeSort {

	public static void sort(int[] nums) {
		
		TreeNode root = null;
		for(int num : nums) {
			root = insertBST(root, num);
		}
		
		InOrderTraversal iot = new InOrderTraversal();
		iot.reverseOrder(root);
	}
	
	public static TreeNode insertBST(TreeNode root, int obj) {
		if(root == null) {
			return new TreeNode(obj, null, null);
		} else {
			if(obj <= root.value) {
				root.left = insertBST(root.left, obj);
			} else {
				root.right = insertBST(root.right, obj);
			}
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {0, 1, 1, -1, -99, 1, 4, 1, 90, 100, 4};
		sort(arr);
	}
}
