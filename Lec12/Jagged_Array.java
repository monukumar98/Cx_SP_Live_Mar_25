package Lec12;

import java.util.Scanner;



public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr = new int[n][];
		// System.out.println(arr[0]);
//		arr[0] = new int[2];
//		arr[1] = new int[3];
//		arr[2] = new int[1];
		for (int i = 0; i < arr.length; i++) {
			int col = sc.nextInt();
			arr[i] = new int[col];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// display
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
