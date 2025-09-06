package Lec51;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -666666);
		}
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, Minimum_Falling_Path(grid, 0, i, dp));

		}
		System.out.println(ans);
	}

	private static int Minimum_Falling_Path(int[][] grid, int cr, int cc, int[][] dp) {
		// TODO Auto-generated method stub
		if (cr == grid.length - 1) {
			return grid[cr][cc];
		}
		if (dp[cr][cc] != -666666) {
			return dp[cr][cc];
		}

		int ans = Integer.MAX_VALUE;
		for (int col = 0; col < grid[0].length; col++) {
			if (col != cc) {
				ans = Math.min(ans, Minimum_Falling_Path(grid, cr + 1, col, dp));
			}

		}
		return dp[cr][cc] = ans + grid[cr][cc];

	}
}
