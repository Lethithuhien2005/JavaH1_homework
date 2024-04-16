package homework6;

public class EquilateralTriangle_Exercise1 extends Shape_Exercise1 {
	private float length;

	public EquilateralTriangle_Exercise1(float length) {
		this.length = length;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	@Override
	public double area() {
		return 0.5 * length * Math.sin((2 * 60 * Math.PI) / 360);
	}

	@Override
	public double perimeter() {
		return 3 * length;
	}

	@Override
	public void draw() {
		System.out.println("Draw a EquilateralTriangle.");
	}
}
