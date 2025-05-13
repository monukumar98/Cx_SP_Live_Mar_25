package Lec15;

import java.util.ArrayList;

public class ArrayList_Demo2 {
	public static void main(String[] args) {
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);// auto-boxing
		ll.add(3);
		ll.add(20);
		ll.add(4);
		ll.add(2, -2);// 2nd index pe -2 add kr do
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		int[] arr = new int[5];

		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.println();
		for (int x : ll) {// un-boxing
			System.out.print(x + " ");
		}

	}
}
