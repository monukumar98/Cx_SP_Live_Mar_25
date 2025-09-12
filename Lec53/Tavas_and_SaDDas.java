package Lec53;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(index(s));

	}

	public static int index(String s) {
		int n = s.length();
		int x = (1 << n) - 2;
		int y = 0, pos = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == '7') {
				y = y + (1 << pos);
			}
			pos++;
		}
		return x + y + 1;
	}

}
