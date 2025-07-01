package Lec29;

public class Student {
	private String name = "kaju";
	private int roll = 16;
	private int age = 21;

	public Student() {
		// TODO Auto-generated constructor stub

	}

	public Student(String name, int age, int roll_no) {
		this.name = name;
		this.age = age;
		this.roll = roll_no;

	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		 this.name=name;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 0) {
				throw new Exception("Baklol age -ve nhi hota hai");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("I am in finally");
		}
	}

//	public void setAge(int age)throws Exception {
//		if (age < 0) {
//			throw new Exception("Baklol age -ve nhi hota hai");
//		}
//		this.age = age;
//	}

}
