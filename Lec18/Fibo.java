package Lec18;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Fib(n));

	}

	public static int Fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int f1 = Fib(n - 1);
		int f2 = Fib(n - 2);
		return f1 + f2;
	}
}
