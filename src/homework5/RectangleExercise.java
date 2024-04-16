package homework5;

public class RectangleExercise {
	public static void main(String[] args) {
		Point2D point = new Point2D(3.0, 4.0);
		Rectangle2D rec = new Rectangle2D(point);
		rec.display();
		System.out.println("Area = " + rec.Area());
		System.out.println("Perimeter = " + rec.Perimeter());
	}
}
