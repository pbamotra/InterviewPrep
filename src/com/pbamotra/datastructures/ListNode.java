package com.pbamotra.datastructures;

public class ListNode<T> {
	public T value;
	public ListNode<T> next;
	
	public ListNode() {
		value = null;
		next = null;
	}
	
	public ListNode(T v) {
		this.value = v;
		this.next = null;
	}
	
	public ListNode(T v, ListNode<T> n) {
		this.value = v;
		this.next = n;
	}
}
