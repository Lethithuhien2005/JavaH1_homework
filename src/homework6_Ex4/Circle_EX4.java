package homework6_Ex4;

public class Circle_EX4 extends Shape_EX4 {
	private double radious;

	public Circle_EX4(double rad) {
		this.radious = rad;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radious, 2);
	}
}
