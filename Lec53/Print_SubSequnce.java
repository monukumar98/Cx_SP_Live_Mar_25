package Lec53;

public class Print_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		Print(s);
	}

	private static void Print(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			System.out.println(pattern(s, i));
		}

	}

	private static String pattern(String s, int i) {
		// TODO Auto-generated method stub
		String ans = "";
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				ans = ans + s.charAt(pos);
			}
			pos++;
			i >>= 1;
		}
		return ans;
	}

}
