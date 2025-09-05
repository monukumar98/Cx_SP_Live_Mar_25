package Lec50;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int LCSBU(int[] s, int[] t) {
		int[][] dp = new int[s.length + 1][t.length + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {

				if (s[i - 1] == t[j - 1]) {
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
}
