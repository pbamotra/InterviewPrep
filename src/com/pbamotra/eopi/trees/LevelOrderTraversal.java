package com.pbamotra.eopi.trees;

import java.util.LinkedList;
import java.util.Queue;

import com.pbamotra.datastructures.TreeNode;

public class LevelOrderTraversal {
	public void print(TreeNode root) {
		if (root == null) return;
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode curr = q.poll();
			System.out.print(curr.value + " ");
			if(curr.hasLeftChild()) q.offer(curr.left);
			if(curr.hasRightChild()) q.offer(curr.right);
		}
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
		
		print(root);
	} */
}
