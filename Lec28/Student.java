package Lec28;

//import java.util.ArrayList;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {
		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SayHey(String name) {
		System.out.println(this.name + " say Hey " + name);
		// Intro_yourSelf();
	}

	public static void MentorName(Student s) {
		// static area me non static wala part access nhi hoga
		// Intro_yourSelf(); error
		System.out.println("Monu Bhaiya " + s.name);
	}

	static {
		// static block
		System.out.println("I am in Student class 1");
	}
	static {
		// static block
		System.out.println("I am in Student class 2");
	}

}
