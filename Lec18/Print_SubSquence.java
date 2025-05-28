package Lec18;

public class Print_SubSquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		Print(ques, "");

	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = ques.charAt(0);
		Print(ques.substring(1), ans);// No
		Print(ques.substring(1), ans + ch);// Yes

	}
}
