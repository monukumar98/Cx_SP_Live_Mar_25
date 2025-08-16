package Lec43;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(11);
		set.add(2);
		set.add(21);
		set.add(39);
		set.add(-4);
		set.add(59);
		set.add(89);
		set.add(39);
		System.out.println(set);
//		System.out.println(set.contains(-4));
//		System.out.println(set.contains(4));
//		System.out.println(set.remove(-4));
//		System.out.println(set.remove(4));
//		System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(11);
		set1.add(2);
		set1.add(21);
		set1.add(39);
		set1.add(-4);
		set1.add(59);
		set1.add(89);
		set1.add(39);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(11);
		set2.add(2);
		set2.add(21);
		set2.add(39);
		set2.add(-4);
		set2.add(59);
		set2.add(89);
		set2.add(39);
		System.out.println(set2);
		for (int val : set) {
			System.out.print(val + " ");
		}
		System.out.println();
		for (int val : set1) {
			System.out.print(val + " ");
		}
		System.out.println();
		for (int val : set2) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

}
