package Lec33;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 7));
		System.out.println(add(2, 9l));
		System.out.println(add(2, 9, 11));
		System.out.println(add(2, 9, 11, 1, 1, 2, 3, 3, 3, 7, 3, 32, 2, 9, 2, 2, 11, 3, 3, 12, 3));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, long b) {
		return (int) (a + b);

	}

	public static int add(int a, int b, int c) {
		return a + b + c;

	}

	public static int add(float f,int x,int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
