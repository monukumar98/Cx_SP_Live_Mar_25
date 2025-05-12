package Lec14;

public class SubString_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codingblocks";
		System.out.println(s.substring(1, 5));
		System.out.println(s.substring(2));
		System.out.println(s.substring(0, 4));
		System.out.println(s.substring(1, 1));
		String str=s.substring(1, 1);//""
		System.out.println(str.length());//"" 
		System.out.println(s.substring(1, 4));

	}

}
