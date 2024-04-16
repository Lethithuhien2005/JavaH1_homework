package homework6_reviewAbstract;

public class Circle extends Shape {
	double pi = 3.14;
	int radius;

	public Circle(String objectName, int radius) {
		super(objectName);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle has been drawn ");
	}

	@Override
	public double area() {
		return (double) ((pi * radius * radius));
	}

}
