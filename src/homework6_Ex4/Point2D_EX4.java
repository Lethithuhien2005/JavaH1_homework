package homework6_Ex4;

import Eg_chapter5.Point2D;

public class Point2D_EX4 {
	private float x;
	private float y;

	public Point2D_EX4() {
		this.x = 0;
		this.y = 0;
	}

	public Point2D_EX4(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void move(float dx, float dy) {
		x += dx;
		y += dy;
	}

	public double distance(Point2D_EX4 A) {
		return Math.sqrt(Math.pow(this.x - A.x, 2) - Math.pow(this.y - A.y, 2));
	}

	public void display() {
		System.out.println("(" + x + "," + y + ")");
	}
	public static void main(String[] args) {
		Point2D_EX4 A = new Point2D_EX4(3, 4);
		Point2D_EX4 B = new Point2D_EX4(6, 7);
		System.out.println("A co toa do la: ");
		A.display();
		System.out.println("B co toa do la: ");
		B.display();
		A.move(4, 2); // di chuyen A den vi tri moi
		System.out.println("Toa do diem A o vi tri moi: ");
		A.display();
		double d = A.distance(B);
		System.out.println("Khoang cach tu A den B: " + d);

	}
}
