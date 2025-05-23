package Lec17;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Fac(n));

	}

	public static int Fac(int n) {
		// Base Case
		if (n == 0) {
			return 1;
		}
		int f = Fac(n - 1);// sp recursion dega 2nd step hai PMI
		return f * n;// BP 3rd step hai PMI
	}
}
