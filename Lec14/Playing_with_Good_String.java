package Lec14;

import java.util.Scanner;

public class Playing_with_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(longestSubString(s));

	}

	public static int longestSubString(String s) {
		int ans = 0;
		int currcount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (isvowels(ch)) {
				currcount++;
			} else {
				ans = Math.max(ans, currcount);
				currcount = 0;
			}
		}
		ans = Math.max(ans, currcount);
		return ans;

	}

	public static boolean isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;

	}
}
