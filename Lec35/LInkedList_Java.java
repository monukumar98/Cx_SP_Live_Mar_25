package Lec35;

import java.util.LinkedList;

public class LInkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);// add last
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.addFirst(10);
		System.out.println(ll);
		System.out.println(ll.remove());// remove first
		System.out.println(ll.removeLast());// remove last
		System.out.println(ll.remove(1));// remove at inddex
		System.out.println(ll);
		System.out.println(ll.get(0));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.size());

	}

}
