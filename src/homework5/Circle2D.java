package homework5;

import java.awt.Color;

public class Circle2D {
	private double radious;
	private Point2D center;
	private Color color;
	public Circle2D(double radious, Point2D center, Color color) {
		this.radious = radious;
		this.center = center;
		this.color = color;
	}
	public double getRadious() {
		return radious;
	}
	public void setRadious(double radious) {
		this.radious = radious;
	}
	public Point2D getCenter() {
		return center;
	}
	public void setCenter(Point2D center) {
		this.center = center;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
