package homework6_Ex4;

import java.util.Scanner;

public class Exercise1_Circle {
	private double r;

	public Exercise1_Circle() {

	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public void InputR() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input radious: ");
		this.r = sc.nextDouble();
	}

	public double Area() {
		return Math.PI * this.r * this.r;
	}

	public double Perimeter() {
		return 2 * Math.PI * this.r;
	}

	public static void main(String[] args) {
		Exercise1_Circle circle = new Exercise1_Circle();
		circle.InputR();
		System.out.println("Area = " + circle.Area());
		System.out.println("Perimeter = " + circle.Perimeter());
	}
}
