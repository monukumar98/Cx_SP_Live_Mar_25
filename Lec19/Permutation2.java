package Lec19;

public class Permutation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		Print(ques, "");

	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (Is_present(ques, ch, i + 1) == false) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				Print(s1 + s2, ans + ch);
			}
		}

	}

	public static boolean Is_present(String str, char ch, int i) {

		for (int j = i; j < str.length(); j++) {
			if (str.charAt(j) == ch) {
				return true;
			}
		}
		return false;
	}

}
