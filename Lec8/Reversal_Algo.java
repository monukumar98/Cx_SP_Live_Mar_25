package Lec8;

public class Reversal_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Rotate(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;// 3%7=3
		// starting n-k element ko reverse krna hai
		Revese(arr, 0, n - k - 1);
		// last k element ko Revese krna hai
		Revese(arr, n - k, n - 1);
		// reverse all element
		Revese(arr, 0, n - 1);
	}

	public static void Revese(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}
	}
}
