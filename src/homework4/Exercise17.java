package homework4;

import java.util.Scanner;

public class Exercise17 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input Str1: ");
		String Str1 = key.nextLine();
		System.out.println("Input Str2: ");
		String Str2 = key.nextLine();
		if (Str1.length() == Str2.length()) {
			int n = Str1.compareTo(Str2);
			if (n == 0) {
				System.out.println("Str1 is equal to Str2");
			} else {
				System.out.println("Str1 is not equal ro Str2");
			}
		} else {
			System.out.println("Str1 is not equal ro Str2");

		}
	}
}
