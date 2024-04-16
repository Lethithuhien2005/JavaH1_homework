package homework6_reviewAbstract;

public class Rectangle extends Shape {
	int length;
	int width;

	public Rectangle(String objectName, int length, int width) {
		super(objectName);
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle has been drawn ");
	}

	@Override
	public double area() {
		return (double) (length * width);
	}
}
