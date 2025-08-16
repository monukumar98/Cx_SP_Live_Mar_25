package Lec43;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());// 16
		sb.append(1);
		sb.append(2);
		sb.append('a');
		sb.append("length");
		sb.append(true);
		sb.append(1 + 2);
		sb.append("no");
		sb.append('b');
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(0));
		System.out.println(sb.substring(1, 3));
		System.out.println(sb.substring(3));
		String s=sb.toString();// Builder to String 
		

	}

}
