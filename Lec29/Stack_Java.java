package Lec29;

import java.util.ArrayList;
import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		System.out.println(st.capacity());
		// add
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(60);
		st.push(50);
		st.push(41);
		System.out.println(st.size());
		System.out.println(st.capacity());
//	ArrayList<Integer> ll  = new ArrayList<>(100);
		// veiw or get
		System.out.println(st.peek());
		// remove
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.isEmpty());
		for (int x : st) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(st.size());
//		for (int x : ll) {
//			System.out.print(x + " ");
//		}

	}

}
