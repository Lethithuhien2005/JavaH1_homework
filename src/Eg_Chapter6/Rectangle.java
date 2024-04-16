package Eg_Chapter6;

public class Rectangle extends Shape {
	private double width;
	private double height;
	public Rectangle(double wVal, double hVal) {
		this.width = wVal;
		this.height = hVal;
	}
	@Override
	public double area() {
		return width*height;
	}
	public String toString() {
		return "Rectangle: " + super.toString();
 	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
