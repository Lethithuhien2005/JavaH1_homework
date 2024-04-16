package homework6;

public class Circle_Exercise1 extends Shape_Exercise1 {
	private String nameCenter;
	private double radious;

	public Circle_Exercise1(String nameCenter, double radious) {
		this.nameCenter = nameCenter;
		this.radious = radious;
	}

	public String getNameCenter() {
		return nameCenter;
	}

	public void setNameCenter(String nameCenter) {
		this.nameCenter = nameCenter;
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}

	@Override
	public double area() {
		return Math.PI * radious * radious;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radious;
	}

	@Override
	public void draw() {
		System.out.println("Draw a Circle with center " + this.getNameCenter() + " and radious: " + this.getRadious());
	}

}
