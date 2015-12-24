package com.pbamotra.eopi.trees;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import com.pbamotra.datastructures.TreeNode;

public class InOrderTraversal {
	public void print(TreeNode root) {
		if (root == null)
			return;

		Stack<TreeNode> s = new Stack<>();
		Set<TreeNode> set = new HashSet<>();

		s.push(root);

		while (!s.isEmpty()) {
			// System.out.println(s);
			TreeNode top = s.peek();
			if (top.hasLeftChild() && !set.contains(top.left)) {
				s.push(top.left);
				set.add(top.left);
			} else {
				s.pop();
				System.out.println(top.value + " ");
				if (top.hasRightChild()) {
					s.push(top.right);
				}
			}
		}
	}

	public void print2(TreeNode root) {
		if (root == null)
			return;

		Stack<TreeNode> s = new Stack<>();
		TreeNode node = root;
		
		while(node != null) {
			s.push(node);
			node = node.left;
		}

		while (!s.isEmpty()) {
			// System.out.println(s);
			TreeNode top = s.pop();
			System.out.println(top.value + " ");
			
			if(top.hasRightChild()) {
				node = top.right;
				while(node != null) {
					s.push(node);
					node = node.left;
				}
			}
		}
	}

	public void print3(TreeNode root) {
		if(root != null) {
				if(root.hasLeftChild()) print3(root.left);
				System.out.println(root.value + " ");
				if(root.hasRightChild()) print3(root.right);
		}
	}
	
	/*public static void main(String[] args) {
		TreeNode root = new TreeNode(0);

		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		root.left = a;
		root.right = b;

		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);

		a.left = d;
		b.right = c;

		TreeNode e = new TreeNode(5);
		b.left = e;

		print3(root);
		System.out.println();
		//print2(root);
	}*/
}
