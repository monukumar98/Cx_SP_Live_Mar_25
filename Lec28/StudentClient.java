package Lec28;

//import java.util.ArrayList;

import Lec27.*;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 ArrayList<Integer> ll = new ArrayList<>();
//		 ArrayList<Integer> ll1 = new ArrayList<>();
		System.out.println("hey");
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = "Kaju";
		s.age = 19;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Katli";
		s1.age = 21;
		System.out.println(s.name);
		System.out.println(s.age);
		s1.Intro_yourSelf();
		s.SayHey("Gautam");
		// Randomized_quick_Sort.Partition(null, 0, 0);
		Student.MentorName(s);
		Student.MentorName(s1);

	}

	static {
		// static block
		System.out.println("I am in Studentclient  class 1");
	}
// method yaha 

}
