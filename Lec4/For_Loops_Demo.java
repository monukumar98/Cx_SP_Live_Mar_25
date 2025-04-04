package Lec4;

public class For_Loops_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable int i=1;

		// while(i<=n) {condition
		// self work
		// variable inc i++;
		// }

		int n = 5;
		// way -1
		for (int i = 1; i <= n; i++) {
			// self work
			System.out.println(i);
		}
		// way -2
		int i = 1;
		for (; i <= n; i++) {
			// self work
			System.out.println(i);
		}
		// way -3
		int j = 1;
		for (; j <= n;) {
			// self work
			System.out.println(i);
			j++;
		}
		// way -4
		for (int k = 1; j <= n;) {
			// self work
			System.out.println(i);
			k++;
		}

	}

}
