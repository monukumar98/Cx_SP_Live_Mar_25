package Lec5;

import java.util.Scanner;

public class Data_Type_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = 'a';
		System.out.println((int) (ch));
		ch++;// ch = (char)(ch+1);
		System.out.println(ch);// 'b'
		ch += 1;// ch = (char)(ch+1);
		System.out.println(ch);
		// ch = ch + 1;
		ch = sc.next().charAt(0);

	}

}
