package Lec6;

public class FUn_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 9;
		int b = 8;
		sub(b, a);
		System.out.println("Bye");

	}

	public static void sub(int a, int b) {

		int c = a - b;
		add(c, b);
		System.out.println(c);
	}

	public static void add(int a, int b) {

		int c = a - b;
		System.out.println(c);//-10
	}

}

