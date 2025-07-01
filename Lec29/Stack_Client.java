package Lec29;

public class Stack_Client {
	public static void main(String[] args) throws Exception {
		Stack st = new Stack();
	//	try {
		st.push(40);
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st.peek());
		st.push(31);
		st.push(18);
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		st.Display();
		
	}
}
