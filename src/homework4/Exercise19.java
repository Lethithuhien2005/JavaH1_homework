package homework4;

import java.util.Scanner;

public class Exercise19 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = key.nextLine();
		System.out.print("a substring of given string: ");
		System.out.print(str.substring(11, 14));
	}
}
