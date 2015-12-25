package com.pbamotra.datastructures;

import com.pbamotra.eopi.trees.LevelOrderTraversal;

public class TreeNode {
	public int value;
	public TreeNode left;
	public TreeNode right;
	public boolean isVisited;
	
	public TreeNode(int n) {
		this.value = n;
		left = null;
		right = null;
		isVisited = false;
	}
	
	public TreeNode(int n, TreeNode l, TreeNode r) {
		this.value = n;
		this.left = l;
		this.right = r;
		isVisited = false;
	}
	
	public boolean hasLeftChild() {
		return (this !=null && this.left != null);
	}
	
	public boolean hasRightChild() {
		return (this !=null && this.right != null);
	}

	@Override
	public String toString() {
		return "[ " + value + " " +  left + " " + right + " " + getStatus() + " ]";
	}
	
	public String getStatus() {
		if(this.isVisited) return "Y";
		return "N";
	}
	
	public void print() {
		LevelOrderTraversal lot = new LevelOrderTraversal();
		lot.print(this);
	}
}
