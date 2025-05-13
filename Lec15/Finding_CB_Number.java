package Lec15;

import java.util.Scanner;

public class Finding_CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		CB_Number(s);

	}

	public static void CB_Number(String s) {
		int c = 0;
		boolean[] visited = new boolean[s.length()];// false
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				long num = Long.parseLong(s.substring(i, j));// i to j-1
				if (isCBnumber(num) == true && isvisited(visited, i, j) == true) {
					for (int k = i; k < j; k++) {// marked kra hai
						visited[k] = true;
					}
					c++;
				}
			}
		}
		System.out.println(c);
	}

	public static boolean isvisited(boolean[] visited, int i, int j) {// i to j-1
		// TODO Auto-generated method stub
		for (int k = i; k < j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;

	}

	public static boolean isCBnumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
