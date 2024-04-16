package Eg_chapter3;

import java.util.Scanner;

public class TriangleCheck {
	public static void main(String[] args) {
		float a, b, c;
		// input data from keyboard
		Scanner keyboard = new Scanner(System.in);

		System.out.println("a= ");
		a = keyboard.nextFloat();

		System.out.println("b= ");
		b = keyboard.nextFloat();

		System.out.println("c= ");
		c = keyboard.nextFloat();

		/* Check if 3 triangle edges are valid */
		if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
			System.out.println("a, b, c are valid \n");
			/* Get type of triangle */
			if ((a == b) && (b == c))
				System.out.println("Equilateral triangle");
			else if ((a == b) || (b == c) || (a == c))
				System.out.println("Isosceles triangle");

			else if (((a * a + b * b == c * c) && (a == b)) || ((a * a + c * c == b * b) && (a == c))
					|| ((b * b + c * c == a * a) && (b == c)))
				System.out.println("Isosceles right triangle");
			else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a))
				System.out.println("Right triangle");
			else
				System.out.println("Triangle");
		} 
		else // belong to the first if
			System.out.println("a, b, c are NOT valid \"");
	}
}
