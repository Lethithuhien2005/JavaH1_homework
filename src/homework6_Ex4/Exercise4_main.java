package homework6_Ex4;

import java.util.Scanner;

public class Exercise4_main {
	public static void main(String[] args) {
		Exercise4_Triangle triangle = new Exercise4_Triangle();
		Scanner key = new Scanner(System.in);
		System.out.println("Input 3 numbers");
		float a = key.nextFloat();
		float b = key.nextFloat();
		float c= key.nextFloat();
		triangle.display(a, b, c);
	}
}
