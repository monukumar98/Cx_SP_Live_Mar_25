package Lec53;

public class Count_set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(Count_setBit(n));
		System.out.println(Fast_Count_setBit(n));

	}

	public static int Fast_Count_setBit(int n) {
		int count = 0;
		while (n > 0) {
			n = (n & (n - 1));
			count++;
		}
		return count;
	}

	public static int Count_setBit(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n = n >> 1;// n>>=1;
		}
		return count;
	}

}
