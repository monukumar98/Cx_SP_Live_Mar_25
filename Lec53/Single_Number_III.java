package Lec53;

import java.util.Arrays;

public class Single_Number_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 3, 2, 5 };
		System.out.println(Arrays.toString(Single_Number(arr)));
	}

	public static int[] Single_Number(int[] arr) {
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		int mask = (xor & (-xor));
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((mask & arr[i]) != 0) {
				a = a ^ arr[i];
			}
		}
		int b = xor ^ a;// xor==> a^b^a=b
		int[] ar = { a, b };
//		return new int[] { a, b };
		return ar;
	}

}
