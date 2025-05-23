package Lec10;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 11, 13, 16, 17, 18 };
		int item = 13;
		System.out.println(Search(arr, item));

	}

	public static int Search(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return -1;

	}

}
