package Lec17;

public class Fact_Tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Fac(n, 1));

	}

	public static int Fac(int n, int ans) {
		// Base Case
		if (n == 0) {
			return 1;
		}

		return Fac(n - 1, ans * n);
	}

}
