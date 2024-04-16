package homework6_Ex4;

import java.util.Scanner;

public class Exercise4_Triangle {
	private float a;
	private float b;
	private float c;

	public Exercise4_Triangle() {

	}

	public Exercise4_Triangle(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean isTriangle(float a, float b, float c) {
		if (a + b > c && a + c > b && b + c > a)
			return true;
		else
			return false;
	}

	public boolean isEquilateral(float a, float b, float c) {
		if (a == b && b == c)
			return true;
		else
			return false;
	}

	public boolean isIsosceles(float a, float b, float c) {
		if (a == b || b == c || a == c)
			return true;
		else
			return false;
	}

	public boolean isRight(float a, float b, float c) {
		if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a))
			return true;
		else
			return false;
	}

	public boolean isRightIsosceles(float a, float b, float c) {
		if ((a * a + b * b == c * c && a == b) || (a * a + c * c == b * b && a == c)
				|| (b * b + c * c == a * a && b == c))
			return true;
		else
			return false;
	}
	public String getType(float a, float b, float c) {
		if (isEquilateral(a,b,c)) return "this is Equilateral triangle";
		else if (isRight( a, b, c)) return "this is Right triangle";
		else return "this is Right Isosceles triangle";
//		if (isRight(a, b, c)) return "this is Right triangle";
//		if (isRightIsosceles(a, b, c)) return "this is Right Isosceles triangle";
	}
	public float area(float a, float b, float c) {
		float s = (a+b+c)/2;
		return (float)Math.sqrt(s*(s-a)*s*(s-b)*s*(s-c));
	}
	public void display(float a, float b, float c) {
		System.out.println("Three edges of triangle: " + a + "\t" + b + "\t"+ c);
		System.out.println("The type of triangle: " + getType(a, b, c));
		System.out.println("Area of triangle: " + area(a, b, c));
	}
}
