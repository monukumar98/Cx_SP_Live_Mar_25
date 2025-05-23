package Lec17;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int n = 4;

		System.out.println(Pow(a, n));
	}

	public static int Pow(int a, int n) {
		if (n == 0) {
			return 1;
		}
		int m = Pow(a, n - 1);
		return m * a;

	}
}