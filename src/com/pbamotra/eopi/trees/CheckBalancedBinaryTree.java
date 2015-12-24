package com.pbamotra.eopi.trees;

import com.pbamotra.datastructures.TreeNode;

public class CheckBalancedBinaryTree {
	static class BalancedTreeAttr {
		boolean isBalanced;
		int height;
		
		public BalancedTreeAttr(boolean a, int b) {
			this.isBalanced = a;
			this.height = b;
		}
	}
	
	public boolean check(TreeNode root) {
		return checkBalanced(root).isBalanced;
	}
	
	private BalancedTreeAttr checkBalanced(TreeNode node) {
		if(node == null) return new BalancedTreeAttr(true, -1);
		
		BalancedTreeAttr leftTree = checkBalanced(node.left);
		if(!leftTree.isBalanced) {
			return new BalancedTreeAttr(false, 0);
		}
		
		BalancedTreeAttr rightTree = checkBalanced(node.right);
		if(!rightTree.isBalanced) {
			return new BalancedTreeAttr(false, 0);
		}
		
		boolean isBalanced = Math.abs(leftTree.height - rightTree.height) <= 1;
		int height = Math.max(leftTree.height, rightTree.height) + 1;
		
		return new BalancedTreeAttr(isBalanced, height);
	}
	
	/* public static void main(String[] args) {
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
		
		TreeNode f = new TreeNode(5);
		d.left = f;
		
		System.out.print(check(root));
	}*/
}
