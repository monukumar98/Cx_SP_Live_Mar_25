package Lec25;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(isPrime(n));

	}

	public static boolean isPrime(int n) {
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}

			i++;
		}
		return true;

	}

}
