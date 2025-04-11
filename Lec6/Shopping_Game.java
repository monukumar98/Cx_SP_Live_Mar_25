package Lec6;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int m = sc.nextInt();// aayush maximum limit
			int n = sc.nextInt();// harshit maximum limit
			Shopping(n, m);// harshit maximum limit, aayush maximum limit
			t--;
		}
	}

	public static void Shopping(int n, int m) {
		int phone = 1;
		int a = 0;
		int h = 0;
		while (true) {
			a = a + phone;
			if (a > m) {
				System.out.println("Harshit");
				break;
			}
			phone++;
			h = h + phone;
			if (h > n) {
				System.out.println("Aayush");
				break;
			}
			phone++;
		}

	}

}
