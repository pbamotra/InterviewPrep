package com.pbamotra.eopi.linkedlist;

import com.pbamotra.datastructures.ListNode;
import com.pbamotra.utils.Utils;

public class ReverseLL {
	public void reverse(ListNode<Integer> head) {
		ListNode<Integer> curr = head, prev = null;
		while (curr != null) {
			ListNode<Integer> next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		Utils.printList(prev);
	}
	
	/*public static void main(String[] args) {
		ListNode<Integer> first = new ListNode<Integer>(10);
		first.next = new ListNode<Integer>(12);
		first.next.next = new ListNode<Integer>(99);
		first.next.next.next = new ListNode<Integer>(200);
		
		reverse(first);
	}*/
}
