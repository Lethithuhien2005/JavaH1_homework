package Eg_chapter3;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		float a, b, c, x1, x2, del;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("a= ");
		a = keyboard.nextFloat();
		System.out.println("b= ");
		b = keyboard.nextFloat();
		System.out.println("c= ");
		c = keyboard.nextFloat();
		del = b * b - 4 * a * c;
		if (del < 0)
			System.out.println("Roots are complex and different");
		else if (del == 0) {
			x1 = x2 = -b / (2 * a);
			System.out.println("Roots are real and different:\n x1=" + x1 + "\n x2=" + x2);

		} else // means del>0
		{
			x1 = (float) (-b + Math.sqrt(del)) / (2 * a);
			x2 = (float) (-b - Math.sqrt(del)) / (2 * a);
			System.out.println("Roots are real and different:\n x1=" + x1 + "\n x2=" + x2);

		}
	}
}
