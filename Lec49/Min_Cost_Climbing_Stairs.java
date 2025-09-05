package Lec49;

public class Min_Cost_Climbing_Stairs {
	public static void main(String[] args) {
		int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int zero = Min_Cost(cost, 0);
		int first = Min_Cost(cost, 1);
		System.out.println(Math.min(zero, first));

	}

	public static int Min_Cost(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		
		int f = Min_Cost(arr, i + 1);
		int s = Min_Cost(arr, i + 2);
		return arr[i] + Math.min(f, s);

	}

}
