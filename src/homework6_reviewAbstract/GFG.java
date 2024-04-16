package homework6_reviewAbstract;

public class GFG {
	public static void main(String[] args) {
		Shape rect = new Rectangle("Rectangle", 2, 3);
		System.out.println("Area of rectangle: " + rect.area());
		rect.moveTo(1, 2);
		System.out.println(" ");
		Shape circle = new Circle("Circle", 2);
		System.out.println("Area of circle: " + circle.area());
		circle.moveTo(2, 4);
	}
}
