package Lec53;

public class Nth_magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(magic_number(n));

	}

	public static int magic_number(int n) {
		int ans = 0;
		int mul = 5;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans = ans + mul;
			}
			n >>= 1;
			mul = mul * 5;
		}
		return ans;

	}
}
