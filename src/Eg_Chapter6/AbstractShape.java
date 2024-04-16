package Eg_Chapter6;

public class AbstractShape {
	public static void main(String[] args) {
		Shape vec[] = { new Circle(5), new Rectangle(4, 5), new Circle(4), new Rectangle(7, 8) };
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
	}
}
