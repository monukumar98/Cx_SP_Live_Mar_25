package Lec33;

import Lec29.*;

public class DynamicStack extends Stack {
	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int[] new_arr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				new_arr[i] = arr[i];
			}
			arr = new_arr;
		}
		//arr[++idx] = item;
		super.push(item);
	}

	public static void main(String[] args) throws Exception {
		Stack st = new DynamicStack();// push
		// DynamicStack st1 = new DynamicStack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.Display();
	}

}
