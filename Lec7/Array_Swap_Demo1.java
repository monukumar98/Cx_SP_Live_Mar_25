package Lec7;

public class Array_Swap_Demo1 {
	public static void main(String[] args) {
		int[] arr = { 10, 4, 5, 67, 8 };
		// int[] arr1 = new int []{ 10, 4, 5, 67, 8 };
		System.out.println(arr[0] + " " + arr[1]);// 10 4
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);//?
	}

	public static void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
