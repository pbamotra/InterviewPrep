package com.pbamotra.eopi.heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
	public static List<Integer> merge (int[][] arr, int N) {
		List<Integer> result = new ArrayList<Integer>();
		
		PriorityQueue<QNode> q = new   PriorityQueue<QNode>();
		
		for(int j=0; j<arr.length; j++) {
			q.add(new QNode(arr[j][0], 0, j));
		}
		
		for(int j=0; j<N; j++) {
			QNode pop = q.poll();
			result.add(pop.val);
			
			int next_arr_no = pop.arr_no;
			int next_index  = pop.index + 1;
			
			if(next_index < arr[next_arr_no].length) {
				q.add(new QNode(arr[next_arr_no][next_index], next_index, next_arr_no));
			} else {
				q.add(new QNode(Integer.MAX_VALUE, next_index, next_arr_no));
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[][] A = new int[4][];
		A[0] = new int[] { 1, 5, 8 };
		A[1] = new int[] { 2, 3, 7, 10 };
		A[2] = new int[] { 4, 15 };
		A[3] = new int[] { 9, 14, 16, 19, 22 };
		List<Integer> result = merge(A, 14);
		
		System.out.println();
		for(int i : result) {
			System.out.print(i + " ");
		}
		
	}
	/* private static class ModArr {
		ArrayList<Integer> arr;
		int arr_no;
		
		ModArr (int[] a, int no) {
			arr = new ArrayList<Integer>();
			for(int i:a)
				this.arr.add(i);
			this.arr_no = no;
		}
	}*/
	
	private static class QNode implements Comparable<QNode>{
		int val;
		int index;
		int arr_no;
		
		public QNode(int v, int i, int no) {
			this.val = v;
			this.index= i;
			this.arr_no = no;
		}

		@Override
		public int compareTo(QNode o) {
			if(this.val == o.val)
				return 0;
			else if(this.val < o.val)
				return -1;
			else
				return 1;
		}
		
	}
}
