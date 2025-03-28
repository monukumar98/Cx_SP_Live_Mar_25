package Lce1;

public class Increment_and_Decrement_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;

//		x++;// x= x+1 ;// post Increment
//		x--;// x= x-1;// post Decrement
//		++x;// x= x+1 ;// pre Increment
//		--x;// x= x-1 ;// pre Decrement
//		System.out.println(x++);//9
//		System.out.println(x);//10
//		System.out.println(--x);// 8
//		System.out.println(x);// 8
//		int c = x++ + 7 + ++x + --x + x--;// 47
		int c = x++ + ++x - --x + --x + x-- - ++x;// 19

	}

}
