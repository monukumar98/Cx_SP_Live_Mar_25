package Lec9;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, -2, 8, 7, 9, 23, 4, 11 };
		// InsertLastElement(arr, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			InsertLastElement(arr, i);
		}

	}

	public static void InsertLastElement(int[] arr, int i) {// i-->arr.length-1
		int j = i - 1;
		int item = arr[i];
		while (j >= 0 && arr[j] > item) {
			arr[j + 1] = arr[j];
			arr[j] = item;
			j--;
		}
		// return j+1
	}

}
