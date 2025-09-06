package Lec51;

import java.util.Arrays;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Path_Sum(grid, 0, 0, dp));

	}

	public static int Path_Sum(int[][] grid, int cr, int cc, int[][] dp) {
		if (cr == grid.length - 1 && cc == grid[0].length - 1) {
			return grid[cr][cc];
		}
		if (cr >= grid.length || cc >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
		int down = Path_Sum(grid, cr + 1, cc, dp);
		int right = Path_Sum(grid, cr, cc + 1, dp);
		return dp[cr][cc] = Math.min(down, right) + grid[cr][cc];

	}

}
