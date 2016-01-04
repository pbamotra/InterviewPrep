package com.pbamotra.eopi.linkedlist;

import com.pbamotra.datastructures.ListNode;

public class FindCycle {
	public void find(ListNode<Integer> head) {
		ListNode<Integer> slow = head, fast = head;
		
		while(fast != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				slow = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				System.out.println("Cycle starts at " + slow.value);
				return;
			}
		}
		
		return;
	}
	
	/*public static void main(String[] args) {
		ListNode<Integer> first = new ListNode<Integer>(10);
		first.next = new ListNode<Integer>(12);
		first.next.next = new ListNode<Integer>(99);
		first.next.next.next = new ListNode<Integer>(200);
		first.next.next.next.next = first.next.next;
		
		find(first);
	}*/
}
