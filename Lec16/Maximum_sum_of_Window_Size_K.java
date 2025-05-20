package Lec16;

public class Maximum_sum_of_Window_Size_K {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 5, 7, 8, 9, 1 };
		int k = 3;
		System.out.println(Maximum_sum(arr, k));

	}

	public static int Maximum_sum(int[] arr, int k) {
		int ans = 0;
		int sum = 0;
		// 1st window ka calculation
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans = sum;
		
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];// grow
			sum -= arr[i - k];// shrink
			ans = Math.max(ans, sum);
		}
		return ans;

	}
}
