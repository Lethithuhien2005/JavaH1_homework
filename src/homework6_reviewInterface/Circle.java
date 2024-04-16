package homework6_reviewInterface;

import homework1_2.shape;

public class Circle implements homework6_reviewInterface.shape {
	double pi = 3.14;
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle has been drawn ");
	}

	@Override
	public double area() {
		return (double) ((pi * radius * radius));
	}
}
