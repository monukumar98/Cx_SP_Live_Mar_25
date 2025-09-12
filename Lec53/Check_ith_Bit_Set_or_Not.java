package Lec53;

public class Check_ith_Bit_Set_or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int i = 4;
		int mask = (1 << i);
		if ((n & mask) == 0) {
			System.out.println("Unset bit");
		} else {
			System.out.println("Set Bit hai ");
		}

	}

}
