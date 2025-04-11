package Lec7;

public class Arrays_Swap_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 4, 7 };
		System.out.println(arr[0] + " " + arr[1]);// 10 20
		Swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);//20 10

	}

	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
}
