package Lec4;

public class Prime_Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 378;
		int i = 2;
		while (i <= n) {
			if (n % i == 0) {
				n = n / i;
				System.out.println(i);
			} 
			else {
				i++;
			}
		}

	}

}
