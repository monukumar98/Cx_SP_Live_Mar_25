package Lec7;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 45, 3, 6, 7, 9, 2 };
		Reverse(arr);
//		Reverse_Print(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Reverse(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = arr.length-1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}
	}

	public static void Reverse_Print(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
