package Lec40;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = { 10, 20, 30, 40, 50 };
		Display(arr1);
		String[] arr2 = { "Raj", "Ankit", "Kaju", "Ankita", "Rajesh" };
		Display(arr2);

	}

	public static <T> void Display(T[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static <T> T get(T[] arr) {
		T x = arr[0];
		return arr[0];
	}

}
