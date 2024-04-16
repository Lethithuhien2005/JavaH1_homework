package Eg_chapter3;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Input number : ");
		int n = k.nextInt();
		if (n == 0)
			System.out.println("Zero");
		else if (n > 0)
			System.out.println("Number is positive");
		else
			System.out.println("Number is negative");

	}
}
