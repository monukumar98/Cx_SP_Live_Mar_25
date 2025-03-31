package Lec2;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 5;// user input
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			// next line ki prep
			System.out.println();
			row++;
			star++;
			space--;
		}

	}

}
