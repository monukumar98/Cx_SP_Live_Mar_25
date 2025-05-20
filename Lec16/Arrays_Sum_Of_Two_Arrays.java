package Lec16;

import java.util.ArrayList;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 0, 2, 9 };
		int[] arr2 = { 3, 2, 4, 5, 6, 7 };
		int[] a = Sum_Of_Two_Arrays(arr1, arr2);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("END");
	}

	public static int[] Sum_Of_Two_Arrays(int[] arr1, int[] arr2) {
		int i = arr1.length - 1, j = arr2.length - 1, carry = 0;
		ArrayList<Integer> ll = new ArrayList<>();
		while (i >= 0 && j >= 0) {
			int sum = carry + arr1[i] + arr2[j];
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;
		}
		while (i >= 0) {
			int sum = carry + arr1[i];
			ll.add(sum % 10);
			carry = sum / 10;
			i--;

		}
		while (j >= 0) {
			int sum = carry + arr2[j];
			ll.add(sum % 10);
			carry = sum / 10;

			j--;
		}
		if (carry > 0) {
			ll.add(carry);
		}
		int[] ans = new int[ll.size()];
		int l = 0;
		for (int k = ll.size() - 1; k >= 0; k--) {
			ans[l++] = ll.get(k);
			// l++;
		}
		return ans;
	}

}
