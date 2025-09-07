package Lec52;

public class Longest_Increasing_Subsequence_N_LOG_N {

	public static void main(String[] args) {
		int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(LIS(arr));
	}

	public static int LIS(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		int len = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > dp[len - 1]) {
				dp[len] = arr[i];
				len++;
			} else {
				int idx = BinarySearch(dp, 0, len, arr[i]);
				dp[idx] = arr[i];
			}
		}
		return len;
	}

	private static int BinarySearch(int[] dp, int lo, int hi, int item) {
		// TODO Auto-generated method stub
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (dp[mid] >= item) {
				ans = mid;
				hi = mid - 1;

			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}
}
