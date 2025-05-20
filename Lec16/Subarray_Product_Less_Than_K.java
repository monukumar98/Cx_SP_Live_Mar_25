package Lec16;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 3, 4, 2 };
		int k = 10;
		System.out.println(Product_Less_Than_K(arr, k));

	}

	public static int Product_Less_Than_K(int[] arr, int k) {
		int ans = 0;
		int ei = 0, si = 0, p = 1;
		while (ei < arr.length) {
			// window grow
			p = p * arr[ei];

			// window shrink
			while (p >= k) {
				p /= arr[si];
				si++;
			}

			// ans calculate
			ans+=(ei-si+1);

			ei++;
		}
		return ans;

	}
}
