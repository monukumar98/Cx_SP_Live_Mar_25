package Lec23;

import java.util.Scanner;

public class Rat_Chases_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < maze[0].length; j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		printpath(maze, 0, 0, ans);
		if (val == 0) {
			System.out.println("NO PATH FOUND");
		}

	}

	static int val = 0;

	public static void printpath(char[][] maze, int row, int col, int[][] ans) {
		if (row == maze.length - 1 && col == maze[0].length - 1 && maze[row][col] != 'X') {
			ans[row][col] = 1;
			Display(ans);
			val = 1;
			return;
		}
		if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || maze[row][col] == 'X') {
			return;
		}
		maze[row][col] = 'X';
		ans[row][col] = 1;
		int[] r = { -1, 0, 1, 0 };
		int[] c = { 0, -1, 0, 1 };
		for (int i = 0; i < c.length; i++) {
			printpath(maze, row + r[i], col + c[i], ans);
		}
//		printpath(maze, row - 1, col, ans);// up
//		printpath(maze, row, col - 1, ans);// left
//		printpath(maze, row + 1, col, ans);// down
//		printpath(maze, row, col + 1, ans);// right
		maze[row][col] = 'O';
		ans[row][col] = 0;
	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
