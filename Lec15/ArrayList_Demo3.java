package Lec15;

import java.util.ArrayList;

public class ArrayList_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();//
		ll.add(10);// auto-boxing
		ll.add(3);
		ll.add(20);
		ll.add(4);
		ll.add(2, -2);// 2nd index pe -2 add kr do
		ll.add(110);// auto-boxing
		ll.add(31);
		ll.add(210);
		ll.add(41);
		ll.add(-21);
		ll.add(11);
		System.out.println(ll);
	}

}
