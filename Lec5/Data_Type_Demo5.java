package Lec5;

public class Data_Type_Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte b=(byte) 128;
//		for (byte b = 0; b < 128; b++) {// b++ => b=(byte)(b+1)
//			System.out.println(b);
//		}
//		for (byte b = 0; b <= 127; b++) {// b++ => b=(byte)(b+1)
//			System.out.println(b);
//		}
		for (byte b = 0; b < 127; b++) {// b++ => b=(byte)(b+1)
			System.out.println(b);
		}
		byte c = 127;
		c += 1;// c=(byte)(c+1)
		System.out.println(c);
		 c = (byte) (c + 1);
	}

}
