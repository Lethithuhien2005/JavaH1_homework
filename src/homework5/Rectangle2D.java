package homework5;

import java.util.Scanner;

public class Rectangle2D {
	private Point2D point;

	public Rectangle2D(Point2D point) {
		this.point = point;
	}

	public Point2D getPoint1() {
		return point;
	}

	public void setPoint1(Point2D point1) {
		this.point = point1;
	}

	public void display() {
		System.out.println("The width of rectangle: " + point.getX());
		System.out.println("The length of retangle: " + point.getY());
	}

	public double Area() {
		return point.getX() * point.getY();
	}
	public double Perimeter() {
		return 2*(point.getX() + point.getY());
	}
}
