package Lec40;

public class Abstract_Demo_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Demo_Chlid ab = new Abstract_Demo_Chlid();
		ab.fun();
		System.out.println(ab.get());
		ab.Add(7);
		// Abstract_Demo ab1 = new Abstract_Demo();
		// java 8
//		Abstract_Demo ab1 = new Abstract_Demo() {
//
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
//		Abstract_Demo ab2 = new Abstract_Demo() {
//			
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};

	}

}
