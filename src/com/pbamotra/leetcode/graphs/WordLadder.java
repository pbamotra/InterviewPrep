package com.pbamotra.leetcode.graphs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
	
	private static class WordNode {
		String word;
		int pathLen;
		
		WordNode(String w, int l) {
			this.word = w;
			this.pathLen = l;
		}
	}
	public static int length(String start, String end, Set<String> dict) {
		
		Queue<WordNode> q = new LinkedList<WordNode>();
		q.add(new WordNode(start, 1));
		dict.add(end);
		
		while(!q.isEmpty()) {
			WordNode word = q.poll();
			
			if(word.word.equals(end)) return word.pathLen;
			
			char[] arr = word.word.toCharArray();
			for(int i=0; i<arr.length; i++) {
				for(char c='a'; c<='z'; c++) {
					char temp = arr[i];
					
					if(arr[i] == c) {
						continue;
					} 
					
					arr[i] = c;
					
					String newword = new String(arr);
					if(dict.contains(newword)) {
						q.add(new WordNode(newword, word.pathLen + 1));
						dict.remove(newword);
					}
					
					arr[i] = temp;
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Set<String> dict = new HashSet<>(Arrays.asList(new String[] {"hot","dot","dog","lot","log"}));
		String start = "hit", end = "mog";
		
		System.out.println("Length of word ladder is " + length(start, end, dict));
	}
}
