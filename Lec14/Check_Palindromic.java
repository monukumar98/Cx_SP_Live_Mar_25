package Lec14;

public class Check_Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "naman";
		System.out.println(isPalindrom(s));

	}

	public static boolean isPalindrom(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
//		for (;i < j;i++,j--) {
//			if (s.charAt(i) != s.charAt(j)) {
//				return false;
//			}
//			
//			
//		}
		return true;

	}
}
