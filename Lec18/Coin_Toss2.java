package Lec18;

public class Coin_Toss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println("\n"+Print(n, ""));

	}

	public static int Print(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return 1;
		}
		int a = 0;
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			a = Print(n - 1, ans + "H");
		}
		int b = Print(n - 1, ans + "T");
		return a + b;
	}

}
