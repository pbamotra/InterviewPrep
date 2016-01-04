package com.pbamotra.eopi.linkedlist;

import com.pbamotra.datastructures.ListNode;
import com.pbamotra.utils.Utils;

public class MergeSortedLL {
	public void merge(ListNode<Integer> first, ListNode<Integer> second) {
		if(first != null && second !=null) {
			
			ListNode<Integer> dummy_head = new ListNode<Integer>(0);
			ListNode<Integer> tail = dummy_head;
			
						
			while(first != null && second != null) {
				boolean isFirstSmaller = first.value <= second.value;
				tail.next = isFirstSmaller ? first : second;
				if (isFirstSmaller)
					first = first.next;
				else
					second = second.next;
				tail = tail.next;
			}
			
			tail.next = first != null ? first : second;
			
			Utils.printList(dummy_head.next);
		}
		
		return;
	}
	
	/*public static void main(String[] args) {
		ListNode<Integer> first = new ListNode<Integer>(10);
		first.next = new ListNode<Integer>(12);
		first.next.next = new ListNode<Integer>(99);
		first.next.next.next = new ListNode<Integer>(200);
		
		ListNode<Integer> second = new ListNode<Integer>(10);
		second.next = new ListNode<Integer>(121);
		second.next.next = new ListNode<Integer>(130);
		second.next.next.next = new ListNode<Integer>(250);
		
		merge(first, second);
	}*/
}
