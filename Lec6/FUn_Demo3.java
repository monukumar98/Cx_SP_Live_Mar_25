package Lec6;

public class FUn_Demo3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 9;
		int b = 8;
		// Add(a, b);// Add(11, a);
//		int x=Add(a, b);
//		System.out.println(x);
		System.out.println(val);// 100
		System.out.println(Add(a, b));
		System.out.println(val);// 95
		System.out.println("Bye");

	}

	public static int Add(int a, int b) {
		int c = a + b;
		int val = 90;
		val = val - 5;
		System.out.println(val);// 85 local me hua
		FUn_Demo3.val = FUn_Demo3.val - 5;// Global me change hua h
		return c + sub(c, a);
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

}
