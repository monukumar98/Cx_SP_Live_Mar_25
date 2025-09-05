package Lec50;

import java.util.Arrays;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[coins.length][amount + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(coins, amount, 0, dp));

	}

	public static int Coin_ChangeBU(int[] coins, int amount) {
		int[][] dp = new int[coins.length + 1][amount + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i < dp.length; i++) {// coins
			for (int am = 1; am < dp[0].length; am++) {// amount
				int inc = 0, exc = 0;
				if (am >= coins[i - 1]) {
					inc = dp[i][am - coins[i - 1]];
				}
				exc = dp[i - 1][am];
				dp[i][am] = inc + exc;
			}

		}
		return dp[dp.length - 1][dp[0].length - 1];

	}

	public static int Coin_Change(int[] coins, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coins.length) {
			return 0;
		}
		if (dp[idx][amount] != -1) {
			return dp[idx][amount];
		}
		int inc = 0, exc = 0;
		if (amount >= coins[idx]) {
			inc = Coin_Change(coins, amount - coins[idx], idx, dp);
		}
		exc = Coin_Change(coins, amount, idx + 1, dp);
		return dp[idx][amount] = inc + exc;

	}
}
