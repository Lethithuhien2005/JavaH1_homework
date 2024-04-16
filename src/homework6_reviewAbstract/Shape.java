package homework6_reviewAbstract;

public abstract class Shape {
	String objectName = " ";

	public Shape(String objectName) {
		this.objectName = objectName;
	}

	public void moveTo(int x, int y) {
		System.out.println(this.objectName + " " + "has been moved to" + " x = " + x + " and y = " + y);
	}

	public abstract double area();

	public abstract void draw();
}
