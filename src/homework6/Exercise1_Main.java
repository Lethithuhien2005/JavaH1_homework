package homework6;

public class Exercise1_Main {
	public static void main(String[] args) {
		Square sqr = new Square(4);
		Circle_Exercise1 circle = new Circle_Exercise1("I", 3.5);
		EquilateralTriangle_Exercise1 ET = new EquilateralTriangle_Exercise1(3);
		sqr.draw();
		System.out.println("The area of Square: " + sqr.area());
		System.out.println("The perimeter of Square: " + sqr.perimeter());
		System.out.println();
		circle.draw();
		System.out.println("The area of Circle: " + circle.area());
		System.out.println("The perimter of Circle: " + circle.area());
		System.out.println();
		ET.draw();
		System.out.println("The area of EquilateralTrianagle: " + ET.area());
		System.out.println("The perimeter of EquilateralTrianagle: " + ET.area());
	}
}
