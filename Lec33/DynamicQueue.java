package Lec33;

import Lec30.Queue;

public class DynamicQueue extends Queue {
	@Override

	public void Enqueue(int item) {
		// TODO Auto-generated method stub
		if (isFull()) {
			int[] new_arr = new int[2 * arr.length];
			// copy
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + i) % arr.length;
				new_arr[i] = arr[idx];
			}
			arr = new_arr;
			front = 0;

		}
		super.Enqueue(item);
	}

	public static void main(String[] args) {
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		System.out.println(dq.Dequeue());
		System.out.println(dq.Dequeue());
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.Display();
	}

}
