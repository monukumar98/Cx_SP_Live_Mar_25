package Lec42;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Rooms_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 9, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 }, { 5, 7 } };
//		Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
//		for (int i = 0; i < intervals.length; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(intervals[i][j] + " ");
//			}
//			System.out.println();
//
//		}

	}

	public static int minimum_room(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
		pq.add(intervals[0]);
		for (int i = 1; i < intervals.length; i++) {
			if(intervals[i][0]<pq.peek()[1]) {
				pq.add(intervals[i]);
				
			}
			else {
				pq.poll();
				pq.add(intervals[i]);
			}
		}
		return pq.size();
	}

}
