package homework1_2;

import java.util.Scanner;

public class chapter1_ex3 {

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
	public double area(double width, double height) {
		return width * height;

	}

	public double perimeter(double width, double height) {
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
		System.out.println(" area is " + area(this.getHeight(), this.getWidth()));
		System.out.println(" perimeter is " + perimeter(this.height, this.width));

	}
}
