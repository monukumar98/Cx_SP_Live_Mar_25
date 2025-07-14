package Lec33;

public class Student {

	String name = "Kaju";
	int age = 22;

	@Override
	public String toString() {
		return name + " karnika  lol " + age;
	}

	public static void main(String[] args) {
		Student s = new Student();
		// Object
		System.out.println(s);
		String s1 = "Hello";
		System.out.println(s1);
	}

}
