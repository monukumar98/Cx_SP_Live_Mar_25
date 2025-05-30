package Lec19;

public class Char_Is_present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ddfhag";
		char ch = 'h';
		System.out.println(Is_present(str, ch, 2));

	}

	public static boolean Is_present(String str, char ch, int i) {
      
		for (int j = i; j < str.length(); j++) {
			if(str.charAt(j)==ch) {
				return true;
			}
		}
		return false;
	}

}
