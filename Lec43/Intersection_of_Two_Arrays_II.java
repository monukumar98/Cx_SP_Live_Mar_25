package Lec43;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 }, nums2 = { 2, 2 };

	}

	public static int[] Intersection_of_Two_Arrays(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {

				map.put(arr2[i], map.get(arr2[i]) + 1);// freq increment by 1
			} else {
				map.put(arr2[i], 1);
			}

		}
		List<Integer> ll = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i]) && map.get(arr1[i]) > 0) {
				ll.add(arr1[i]);
				map.put(arr1[i], map.get(arr1[i]) - 1); // freq dec by 1
			}

		}
		int[] ans = new int[ll.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = ll.get(i);
		}
		return ans;
	}

}
