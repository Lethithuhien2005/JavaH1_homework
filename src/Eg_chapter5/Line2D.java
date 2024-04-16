package Eg_chapter5;

public class Line2D {
	private Point_2D first;
	private Point_2D second;

	public Line2D(Point_2D p1, Point_2D p2) {
		this.first = p1;
		this.second = p2;
	}

	public void details() {
		System.out.println(
				"((" + first.getX() + "," + first.getY() + ") , (" + second.getX() + "," + second.getY() + "))");

	}

	public boolean isParallel(Line2D otherLine) {
		double thisDelta = (first.getY() - second.getY()) / (first.getX() - second.getX());
		double otherDelta = (otherLine.first.getY() - otherLine.second.getY())
				/ (otherLine.first.getX() - otherLine.second.getX());
		return (thisDelta == otherDelta);
	}

	public double length() {
		return Math.sqrt(Math.pow(first.getX() - second.getX(), 2) + Math.pow(first.getY() - second.getX(), 2));
	}
}
