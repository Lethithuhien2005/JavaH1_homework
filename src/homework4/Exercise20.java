package homework4;

import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str1 = key.nextLine();
		System.out.println("Input a substring: ");
		String str2 = key.nextLine();
		System.out.println("str1 contains str2:  " + str1.contains(str2));
	}
}
