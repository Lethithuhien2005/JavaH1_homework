package homework6_Ex4;

public class Rectangle_EX4 extends Shape_EX4 {
	private double width;
	private double height;

	public Rectangle_EX4(double wVal, double hVal) {
		this.width = wVal;
		this.height = hVal;
	}

	@Override
	public double area() {
		return width * height;
	}
}