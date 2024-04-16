package homework6;

public class Square extends Shape_Exercise1{
	private float Edge;

	public Square(float edge) {
		this.Edge = edge;
	}

	public float getEdge() {
		return Edge;
	}

	public void setEdge(float edge) {
		Edge = edge;
	}

	@Override
	public double area() {
		return Math.pow(this.Edge,2);
	}

	@Override
	public double perimeter() {
		return 2*this.Edge;
	}

	@Override
	public void draw() {
		 System.out.println("Draw a Square.");
	}
}
