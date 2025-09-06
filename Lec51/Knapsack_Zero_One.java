package Lec51;

import java.util.Arrays;

public class Knapsack_Zero_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap = 4;
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] val = { 8, 4, 0, 5, 3 };
		int[][] dp = new int[wt.length][cap + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Knapsack(wt, val, cap, 0, dp));

	}

	public static int Knapsack(int[] wt, int[] val, int cap, int idx, int[][] dp) {
		if (idx == wt.length || cap == 0) {
			return 0;
		}
		if (dp[idx][cap] != -1) {
			return dp[idx][cap];
		}
		int inc = 0, exc = 0;
		if (cap >= wt[idx]) {
			inc = val[idx] + Knapsack(wt, val, cap - wt[idx], idx + 1, dp);
		}
		exc = Knapsack(wt, val, cap, idx + 1, dp);
		return dp[idx][cap] = Math.max(inc, exc);

	}

}
