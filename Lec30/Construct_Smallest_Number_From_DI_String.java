package Lec30;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "IIIDIDDD";
		System.out.println(Construct_Smallest_Number(str));

	}

	public static String Construct_Smallest_Number(String str) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[str.length() + 1];
		int c = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = c;
				c++;
				while (!st.isEmpty()) {
					ans[st.pop()] = c;
					c++;
				}
			} else {
				st.push(i);
			}
		}
		String s = "";
		for (int i = 0; i < ans.length; i++) {
			s = s + ans[i];
		}
		return s;
	}

}
