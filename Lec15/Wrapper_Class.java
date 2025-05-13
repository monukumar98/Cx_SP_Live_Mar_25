package Lec15;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer a1 = 10;// auto-boxing
		System.out.println(a);
		System.out.println(a1);
		Long l = 89l;
		long ll = 7890;
//		l=ll;
		a1 = a;// auto-boxing
		ll = l;// un-boxing
		Integer c1 = 102;
		Integer c2 = 102;
		Integer c3 = 722;
		Integer c4 = 722;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
		System.out.println(c3.equals(c4));
		Character ch1 = 'a';
		Character ch2 = 'a';
		System.out.println(ch1 == ch2);
		Boolean b1 = true;
		Boolean b2 = true;
		System.out.println(b1 == b2);
		Double d1 = 189.7;
		Double d2 = 189.7;
		System.out.println(d1 == d2);
		System.out.println(a == a1);// content

	}

}
