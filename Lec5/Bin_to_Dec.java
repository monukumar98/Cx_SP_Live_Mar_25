package Lec5;

public class Bin_to_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100111;
		int sum = 0;
		int mul = 1;// 2^0
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			mul = mul * 2;// 2^1
			n=n/10;
		}
		System.out.println(sum);
	}

}
