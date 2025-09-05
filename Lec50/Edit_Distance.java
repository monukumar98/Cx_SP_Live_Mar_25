package Lec50;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";

	}

	public static int Min_Ops(String s, String t, int i, int j) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = Min_Ops(s, t, i + 1, j + 1);
		} else {
			int D = Min_Ops(s, t, i + 1, j);
			int R = Min_Ops(s, t, i + 1, j + 1);
			int I = Min_Ops(s, t, i, j + 1);
			ans = Math.min(R, Math.min(D, I));
		}
		return ans;
	}

}
