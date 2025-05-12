package Lec14;

public class String_LexcoGraphic_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "komalsharma";
		String s2 = "kunal";
		System.out.println(s1.compareTo(s2));// -ve s1<s2 | +ve s1>s2 | 0 s1==s2
		String s3 = "ankita";
		String s4 = "ankit";
		System.out.println(s3.compareTo(s4));
		System.out.println(compareTo(s1, s2));
		System.out.println(compareTo(s3, s4));
	}

	public static int compareTo(String s1, String s2) {
		if (s1 == s2) {
			return 0;
		}
		int n = Math.min(s1.length(), s2.length());
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length() - s2.length();

	}
}
