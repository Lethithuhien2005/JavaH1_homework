package homework4;

import java.util.Scanner;

public class Exercise18 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input a string 1: ");
		String str1 = key.nextLine();
		System.out.println("Input a string 2: ");
		String str2 = key.nextLine();
		System.out.println(str1.concat(" " + str2));
	}
}
