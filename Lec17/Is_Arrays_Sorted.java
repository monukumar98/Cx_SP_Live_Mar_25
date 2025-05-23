package Lec17;

public class Is_Arrays_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 8, 11, 15 };
		System.out.println(isSoted(arr, 0));

	}

	public static boolean isSoted(int[] arr, int i) {
		if (i == arr.length - 1) {
			return true;
		}
		if (arr[i] > arr[i + 1]) {
			return false;
		}
		return isSoted(arr, i + 1);
	}

}
