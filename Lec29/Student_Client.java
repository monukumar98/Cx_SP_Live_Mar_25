package Lec29;
//import java.lang.*;
public class Student_Client {

	public static void main(String[] args) {// throws Exception {
		// TODO Auto-generated method stub
		Student s = new Student("Ananda", 22, 45678);
//		s.name = "Anand";
//		s.age=-42;
//		
		System.out.println("Hey");
		s.setAge(-42);
		System.out.println(s.getAge());

	}

}
