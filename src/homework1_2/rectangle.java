package homework1_2;

import java.util.Scanner;

public class rectangle {
	private double width;
	private double height;

	// get, set method
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// methods
	public double area() {
		return width * height;

	}

	public double perimeter() {
		return (width + height) * 2;
	}
	// write a method that print area

	public void Input() {
		Scanner key = new Scanner(System.in);
		System.out.println(" input height");
		this.height = key.nextDouble();
		System.out.println(" input width");
		this.width = key.nextDouble();
	}

	public void output() {
		System.out.println(" area is " + area());
		System.out.println(" perimeter is " + perimeter());
	}
}
