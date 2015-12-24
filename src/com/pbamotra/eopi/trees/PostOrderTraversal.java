package com.pbamotra.eopi.trees;

import com.pbamotra.datastructures.TreeNode;

public class PostOrderTraversal {
	public void print(TreeNode root) {
		if(root != null){
			print(root.left);
			print(root.right);
			System.out.println(root.value + " ");
		}
	}
	
	/* public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		root.left  = b;
		root.right = a;
		
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		
		a.left = d;
		b.right = c;
		
		TreeNode e = new TreeNode(5);
		b.left = e;
		
		print2(root);
	}*/
}
