package homework4;

import java.util.Scanner;

public class Exercise1 {
	public static double smallestNumber(double a, double b, double c) {
		double min = 0;
		if (a < b && b < c)
			min = a;
		if (b < c && b < a)
			min = b;
		if (c < a && c < b)
			min = c;
		return min;

	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input three numbers: ");
		System.out.print("a= ");
		double a = key.nextDouble();
		System.out.print("b= ");
		double b = key.nextDouble();
		System.out.print("c=");
		double c = key.nextDouble();
		System.out.println("the smallest number among three numbers is: " + smallestNumber(a, b, c));
	}
}
