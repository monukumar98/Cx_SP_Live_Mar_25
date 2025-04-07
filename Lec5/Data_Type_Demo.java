package Lec5;

import java.util.Scanner;

public class Data_Type_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte b = (byte) (428);// -128 to 127
		short s = 12;
		int x = 9;
		long l = 13;
		byte b1 = -5;
		System.out.println(b);
		b = (byte) (300);// -128 to 127
		b = 5;
		int i = b;// No
		b = sc.nextByte();
		i = sc.nextInt();
		l = sc.nextLong();
		s = sc.nextShort();
		long ll = 2929299999l;
	}

}
