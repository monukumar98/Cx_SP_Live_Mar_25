package Lec35;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Using_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedList<Integer> q = new LinkedList<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(10);// add last--> Enqueue
		q.add(20);
		q.add(40);
		q.add(30);
		System.out.println(q);
		System.out.println(q.poll());// remove first --> Dequeue
		System.out.println(q);
		System.out.println(q.peek());// get first --> getfornt

	}

}
