package Eg_chapter2;

public class Cube {
	private double size;

	Cube(double val) {
		size = val;
	}

	public void setSize(double val) {
		size = val;
	}

	public double getSize() {
		return size;
	}

	double volume() {
		return size * size * size;
	}

	void details() {
		System.out.println("\n details of rectangle");
		System.out.println("width="+ size);
		System.out.println("height="+size);
		System.out.println("length="+size);
		System.out.println("volume="+volume()+"\n\n");
	}
}
