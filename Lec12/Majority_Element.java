package Lec12;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(MooreVoting(arr));

	}

	public static int MooreVoting(int[] arr) {
		int vote = 1;
		int ele = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == ele) {
				vote++;
			} else {
				vote--;
				if (vote == 0) {
					ele = arr[i];
					vote = 1;
				}
			}
		}
		return ele;

	}

}
