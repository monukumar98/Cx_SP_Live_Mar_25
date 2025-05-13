package Lec15;

public class String_to_Intgere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "5467890";
		int x = Integer.parseInt(str);
		x++;
		System.out.println(x);
		String str1 = "54678965780";
		long a=Long.parseLong(str1);
		System.out.println(a);
		String str3 = "54678.901";
		double d= Double.parseDouble(str3);
		System.out.println(d);

	}

}
