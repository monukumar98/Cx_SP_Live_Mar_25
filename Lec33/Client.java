package Lec33;

public class Client {
	public static void main(String[] args) {

//		// Case-1
//		P obj = new P();
//		System.out.println(obj.d);// 1
//		System.out.println(obj.d1);// 10
//		obj.fun();
//		obj.fun1();
		// Case-2
//		P obj = new C();// List<Integer> ll = new ArrayList<>();
//		System.out.println(obj.d);// 1
//		System.out.println(((C) obj).d);// 2
//		System.out.println(obj.d1);// 10
//		System.out.println(((C) obj).d2);// Type Cast obj Type P to C
//		obj.fun();// C
//		obj.fun1();// P
//		((C) obj).fun2();

//		// Case-3
//		C obj = new P();//ArrayList<Integer> ll = new List<>();
//		System.out.println(obj.d);//
//		System.out.println(obj.d);//
//		System.out.println(obj.d1);//
//		System.out.println(obj.d2);// run time error

		// Case-4
		C obj = new C();// ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(obj.d);// 2
		System.out.println(((P) obj).d);// 1
		System.out.println(obj.d1);// 10
		System.out.println(obj.d2);// 20
		obj.fun();
		obj.fun1();
		obj.fun2();
		
	}

}
