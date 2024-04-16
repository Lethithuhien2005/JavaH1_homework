package Eg_Chapter4;

import java.util.Scanner;

public class CommonDivisor {

	public static int comDiv(int a, int b) {
		return (b == 0) ? a : comDiv(b, a % b);
	}

	public static void main(String[] args) {
		int a, b;
		Scanner key = new Scanner(System.in);
		System.out.print("a= ");
		a = key.nextInt();
		System.out.print("b= ");
		b = key.nextInt();

		System.out.println("UCLN cua " + a + " va " + b + " la " + comDiv(a, b));

	}
}
