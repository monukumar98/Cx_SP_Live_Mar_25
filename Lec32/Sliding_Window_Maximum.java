package Lec32;

import java.util.Deque;
import java.util.LinkedList;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k=3;
	}

	public static int[] Maximum_Window(int[] arr, int k) {
		int[] ans = new int[arr.length - k];
		Deque<Integer> dq = new LinkedList<>();// deqeue
		// 1st window ka calculation
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
				dq.removeLast();// dq.removeLast();

			}
			dq.add(i);
		}
		int idx = 0;
		ans[idx++] = arr[dq.getFirst()];
		for (int i = k; i < arr.length; i++) {
			// grow
			while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
				dq.removeLast();// dq.removeLast();

			}
			dq.add(i);
			// shrink
			if(dq.getFirst()==i-k) {
				dq.removeFirst();
			}
			// calculation
			ans[idx++] = arr[dq.getFirst()];
		}
		return ans;

	}
}
