package Eg_Chapter6;

public class EquilateralTriangle extends Shape {
	private double length;

	public EquilateralTriangle(double length) {
		this.length = length;
	}

	@Override
	public double area() {
		return 0.5*length*Math.sin(2*60*Math.PI/360);
	}
	public String toString() {
		return "EquilateralTriangle: " + super.toString();
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
