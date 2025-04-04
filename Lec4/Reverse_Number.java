package Lec4;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2346;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;// sum = sum + rem;
			n /= 10;// n= n/10;

		}
		System.out.println(rev);
	}

}
