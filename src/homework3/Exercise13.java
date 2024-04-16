package homework3;

public class Exercise13 {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 4; i > 1; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i * 2 + 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= 4; i++) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i * 2 + 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
