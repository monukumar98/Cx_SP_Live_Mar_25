package Lec1;

public class Maximum_3_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 19;
		int b = 12;
		int c = 14;
		if(a>=b && a>=c) {
			System.out.println(a);
		}
		else if(b>=a && b>=c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}
