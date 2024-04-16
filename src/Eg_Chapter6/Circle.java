package Eg_Chapter6;

public class Circle extends Shape {
	private double radious;

	public Circle(double rad) {
		this.radious = rad;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radious, 2);
	}
	public String toString() {
		return "Circle: " + super.toString();
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
