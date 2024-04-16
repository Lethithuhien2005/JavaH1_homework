package homework6_Ex4;

public class Rectangle_EX4_ex6 extends Shape_EX4_ex6 implements Comparable{
	private double width;
	private double height;
	public Rectangle_EX4_ex6(double w, double h) {
		this.width = w;
		this.height = h;
	}
	@Override
	public int compareTo(Object o) {
		Rectangle_EX4_ex6 otherRect= (Rectangle_EX4_ex6)o;
		return (int)(this.area()-otherRect.area());
	}
	@Override
	public double area() {
		return width*height;
	}
}
