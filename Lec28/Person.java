package Lec28;

public class Person {
	String name = "Kaju";
	int age = 91;
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name ,int age) {
		System.out.println("constructor");
		this.name=name;
		this.age=age;

	}
//	static {
//		System.out.println("Hey static");
//	}
//	public Person(String name ) {
//		
//	}
//	public Person(int  age ) {
//		
//	}
}
