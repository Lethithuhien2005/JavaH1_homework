package Eg_chapter5;

public class Point_2D {
	private double x;
	private double y;

	public Point_2D(double xVal, double yVal) {
		this.x = xVal;
		this.y = yVal;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void details() {
		System.out.println("(" + x + "," + y + ")");
	}
}
