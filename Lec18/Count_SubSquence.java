package Lec18;

public class Count_SubSquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
//		Print(ques, "");
//		System.out.println("\n" + c);
		System.out.println("\n" + Print(ques, ""));

	}

	public static int Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int a = Print(ques.substring(1), ans);// No
		int b = Print(ques.substring(1), ans + ch);// Yes
		return a + b;

	}

	
	// static int c = 0;

//	public static void Print(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.print(ans + " ");
//			c++;
//			return;
//		}
//		char ch = ques.charAt(0);
//		Print(ques.substring(1), ans);// No
//		Print(ques.substring(1), ans + ch);// Yes
//
//	}
}
