package Lce1;

public class Lotter_Game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int n = 61;
		if (n >= 15 && n <= 20) {
			System.out.println("Bike");
			if (n >= 15 && n <= 18) {
				System.out.println("Hero");
			} else {
				System.out.println("KTM");
			}

		} else if (n >= 50 && n <= 80) {
			System.out.println("Cycle");
			if (n >= 50 && n <= 70) {
				System.out.println("Automatic_ Cycle");
			} else {
				System.out.println("Manual_Cycle");
			}

		} else if (n >= 100 && n <= 200) {
			System.out.println("Car");
			if (n >= 100 && n <= 151) {
				System.out.println("THAR");
			} else {
				System.out.println("Creta");
			}

		} else if (n >= 250 && n <= 300) {
			System.out.println("Mac");
			if (n >= 250 && n >= 261) {
				System.out.println("M1");
			} else {
				System.out.println("M2");
			}

		} else if (n >= 1200 && n <= 1400) {
			System.out.println("Kurkure");
		} else {
			System.out.println("Happy BirthDay!!");
		}
	}

}
