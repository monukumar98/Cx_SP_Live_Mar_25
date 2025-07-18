package Lec35;

import java.util.LinkedList;

public class Stack_Using_LinkedList {

	private LinkedList<Integer> ll = new LinkedList<>();

	public int size() {
		return ll.size();
	}

	public boolean isEmpty() {
		return ll.size() == 0;
	}

	public void push(int item) {
		ll.addFirst(item);
	}

	public int pop() {
		return ll.remove();// remove first
	}

	public int peek() {
		return ll.getFirst();
	}
	public static void main(String[] args) {
		Stack_Using_LinkedList st = new Stack_Using_LinkedList();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.peek());
	}

}

