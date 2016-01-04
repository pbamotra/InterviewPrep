package com.pbamotra.eopi.linkedlist;

import com.pbamotra.datastructures.ListNode;
import com.pbamotra.utils.Utils;

public class EvenOddMerge {
	
	public void merge(ListNode<Integer> head) {
		if(head == null)
			return;
		ListNode<Integer> current = head, prev= head, end = head;
		
		int len = 1;
		while(end.next != null) {
			end = end.next;
			len++;
		}
		
		if (len < 3) {
			Utils.printList(head);
			return;
		}
		
		ListNode<Integer> dummy_end = end;
		
		int i=0;
		while(current != end.next) {
			
			if (i%2 != 0) {
				dummy_end.next = current;
				prev.next = current.next;
				current = current.next;
				dummy_end.next.next = null;
				dummy_end = dummy_end.next;
				prev = prev.next;
			} else {
				current = current.next;
			}
			
			i++;
		}

		Utils.printList(head);
	}
	
	/*public static void main(String[] args) {
		ListNode<Integer> first = new ListNode<Integer>(10);
		first.next = new ListNode<Integer>(12);
		first.next.next = new ListNode<Integer>(99);
		first.next.next.next = new ListNode<Integer>(200);
		first.next.next.next.next = new ListNode<Integer>(2001);
		merge(first);
	}*/
}
