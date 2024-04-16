package homework6_reviewInterface;

public class GFG {
	public static void main(String[] args) {
		shape rect = new Rectangle(2, 3);
		System.out.println("Area of rectangle: " + rect.area());

		shape circle = new Circle(2);
		System.out.println("Area of circle: " + circle.area());
	}
}
