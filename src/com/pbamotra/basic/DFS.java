package com.pbamotra.basic;

import java.util.ArrayList;
import java.util.List;

import com.pbamotra.datastructures.TreeNode;

public class DFS {
	
	public static List<String> binaryTreePaths(TreeNode root) {

	    List<String> ret = new ArrayList<String>();

	    if(root == null){
	        return ret;
	    }

	    dfs(root, new StringBuilder(), ret);

	    return ret;
	}

	public static void dfs(TreeNode root, StringBuilder sb, List<String> ret){

	   if(root.left == null && root.right == null){
	       sb.append(root.value);
	       ret.add(sb.toString());
	       return;
	   }

	   sb.append(root.value);
	   sb.append("->");

	   if(root.left != null){
	       dfs(root.left, new StringBuilder(sb), ret);
	   }

	   if(root.right != null){
	       dfs(root.right, new StringBuilder(sb), ret);
	   }
	}
	
	public static void main(String[] args) {
		TreeNode root 	= new TreeNode(1);
		root.left 	  	= new TreeNode(-1);
		root.right    	= new TreeNode(10);
		root.left.left	= new TreeNode(4);
		root.right.right= new TreeNode(11);
		root.right.left = new TreeNode(9);
		
		//root.print();
		System.out.println();
		
		List<String> path = new ArrayList<String>();
		path  = binaryTreePaths(root);
		for (String i : path) {
			System.out.println(i + " ");
		}
	}
}
