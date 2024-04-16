package homework5;

import java.awt.*;

public class Circle2DExercise {
	public static void main(String[] args) {
		Point2D center = new Point2D(2.0, 1.0);
		Color color = Color.BLUE;
		Circle2D circle = new Circle2D(2.5, center, color);
		System.out.println("radiouis: " + circle.getRadious());
		System.out.println("color: " + circle.getColor());
		circle.setCenter(center);
		
	}
}
