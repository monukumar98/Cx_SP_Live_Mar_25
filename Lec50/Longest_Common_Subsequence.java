package Lec50;

import java.util.Arrays;

public class Longest_Common_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String t = "ace";
		int[][] dp = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[0].length; j++) {
//				dp[i][j] = -1;
//			}
//		}
		System.out.println(LCS(s, t, 0, 0, dp));

	}

	public static int LCSBU(String s, String t) {
		int[][] dp = new int[s.length() + 1][t.length() + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {

				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					int f1 = dp[i - 1][j];
					int s1 = dp[i][j - 1];
					dp[i][j] = Math.max(f1, s1);
				}

			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

	public static int LCS(String s, String t, int i, int j, int[][] dp) {
		if (i == s.length() || j == t.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;

		if (s.charAt(i) == t.charAt(j)) {
			ans = 1 + LCS(s, t, i + 1, j + 1, dp);
		} else {
			int f1 = LCS(s, t, i + 1, j, dp);
			int s1 = LCS(s, t, i, j + 1, dp);
			ans = Math.max(f1, s1);

		}
		return dp[i][j] = ans;
	}

}
