package Eg_Chapter6;

public abstract class Shape implements Comparable {
	public abstract double area();

	public int compareTo(Shape other) {
		return (int) (this.area() - other.area());
	}

	public String toString() {
		return "area=" + area();
	}
}
