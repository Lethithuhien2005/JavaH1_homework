package homework3;

public class Exercise14 {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i <= 4; i++) {
			for (j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
