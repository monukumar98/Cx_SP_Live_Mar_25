package Lec12;

public class Two_D_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[1][2]);
		int[][] other = arr;

		// row length
		int row = arr.length;// 3
		// col length
		int col = arr[0].length;// 4
		System.out.println(row);
		System.out.println(col);

	}

}
