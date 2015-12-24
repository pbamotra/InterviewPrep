package com.pbamotra.eopi.trees;

import com.pbamotra.datastructures.TreeNode;

public class PreOrderTraversal {
	public void print(TreeNode root) {
		if(root != null){
			System.out.println(root.value + " ");
			print(root.left);
			print(root.right);
		}
	}
}
