package Lec30;

public class Queue {
	private int[] arr;
	private int front = 0;
	private int size = 0;
	// private int rear = 0;

	public Queue() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public Queue(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	// O(1)
	public int size() {
		return size;
	}

	// O(1)
	public boolean isEmpty() {
		return size == 0;
	}

	// O(1)
	public boolean isFull() {
		return size == arr.length;
	}

	// O(1)
	public void Enqueue(int item) {
		int idx = (front + size) % arr.length;

		arr[idx] = item;
		size++;
//		rear++;

	}

	// O(1)
	public int Dequeue() {
		int x = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return x;

	}

	// O(1)
	public int getFront() {
		int x = arr[front];
		return x;

	}
	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx=(front+i)%arr.length;
			System.out.print(arr[idx]+" ");
			
		}
		System.out.println();
	}

}
