package com.pbamotra.eopi.trees;

import com.pbamotra.datastructures.TreeNode;

public class CheckBinaryTreeSymmetric {
	public boolean check(TreeNode root) {
		return root == null || checkSymmetric(root.left, root.right);
	}

	private boolean checkSymmetric(TreeNode left, TreeNode right) {
		if(left == null && right == null) {
			return true;
		} else if (left != null && right != null) {
			return left.value == right.value && checkSymmetric(left.left, left.right) && checkSymmetric(left.right, left.left);
		} 
		
		return false;
	}
}

