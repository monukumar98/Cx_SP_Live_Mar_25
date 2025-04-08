package Lec6;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Is_Armstrong(n));
	}

	public static boolean Is_Armstrong(int n) {
		int cod = Count_of_Digit(n);// 4
		int sum = 0;
		int p=n;//371
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, cod));
			n = n / 10;
		}
		if (sum == p) {
			return true;
		} else {
			return false;
		}
	}

	public static int Count_of_Digit(int n) {
		int c = 0;
		while (n > 0) {
			c++;
			n = n / 10;
		}
		return c;

	}

}
