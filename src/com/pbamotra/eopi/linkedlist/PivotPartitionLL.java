package com.pbamotra.eopi.linkedlist;

import com.pbamotra.datastructures.ListNode;
import com.pbamotra.utils.Utils;

public class PivotPartitionLL {
	public void partition(ListNode<Integer> head, int pivot) {
		
		if (head == null) return;
		if (head.next == null) return;
		
		ListNode<Integer> current_iter = head, smaller_iter = new ListNode<Integer>(), equal_iter = new ListNode<Integer>(), greater_iter = new ListNode<Integer>();
		ListNode<Integer> small_head = smaller_iter, equal_head = equal_iter, greater_head = greater_iter;
		
		while(current_iter != null) {
			if(current_iter.value < pivot) {
				smaller_iter.next = current_iter;
				smaller_iter = current_iter;
				current_iter = current_iter.next;
			} else if (current_iter.value == pivot){
				equal_iter.next = current_iter;
				equal_iter = current_iter;
				current_iter = current_iter.next;
			} else {
				greater_iter.next = current_iter;
				greater_iter = current_iter;
				current_iter = current_iter.next;
			}
		}
		
		smaller_iter.next = equal_iter.next = greater_iter.next = null;
		
		if (greater_head.next != null) {
			equal_iter.next = greater_head.next;
		}
		
		if(equal_head.next != null) {
			smaller_iter.next = equal_head.next;
		}
		
		Utils.printList(small_head.next);
	}
	
	/*public static void main(String[] args) {
		ListNode<Integer> first = new ListNode<Integer>(10);
		first.next = new ListNode<Integer>(12);
		first.next.next = new ListNode<Integer>(100);
		first.next.next.next = new ListNode<Integer>(200);
		first.next.next.next.next = new ListNode<Integer>(99);
		first.next.next.next.next.next = new ListNode<Integer>(201);
		
		partition(first, 100);
	}*/
}
