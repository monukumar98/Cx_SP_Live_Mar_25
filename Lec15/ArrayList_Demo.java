package Lec15;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		// ArrayList<String> ll1=new ArrayList<>();
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add(10);
		ll.add(3);
		ll.add(20);
		ll.add(4);
		ll.add(2, -2);// 2nd index pe -2 add kr do
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(2));
		System.out.println(ll.remove(1));
		System.out.println(ll);
		// update
		ll.set(1, 90);// index value
		Collections.sort(ll);// sort
		System.out.println(ll);
		Collections.reverse(ll);// O(N)
		System.out.println(ll);

	}

}
