package homework6_Ex4;

import java.util.Scanner;

public class Exercise3_Complex {
	private int real;
	private int image;

	public Exercise3_Complex(int real, int image) {
		this.real = real;
		this.image = image;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public static String Sum(Exercise3_Complex cpl1, Exercise3_Complex cpl2) {
		return (cpl1.getReal() + cpl2.getReal() + " + " + (cpl1.getImage() + cpl2.getImage()) + "i");
	}

	public static String Subtract(Exercise3_Complex cpl1, Exercise3_Complex cpl2) {
		return (cpl1.getReal() - cpl2.getReal() + " + " + (cpl1.getImage() - cpl2.getImage()) + "i");
	}

	public static String Multi(Exercise3_Complex cpl1, Exercise3_Complex cpl2) {
		return ((cpl1.getReal() * cpl2.getReal() - (cpl1.getImage() * cpl2.getImage()) + " + "
				+ (cpl1.getReal() * cpl2.getImage() + cpl2.getReal() * cpl1.getImage())) + "i");
	}

	public static void main(String[] args) {
		Exercise3_Complex cpl1 = new Exercise3_Complex(2, 3);
		Exercise3_Complex cpl2 = new Exercise3_Complex(1, 4);
		System.out.println("Sum of 2 complex numbers = " + Sum(cpl1, cpl2));
		System.out.println("Subtraction of 2 complex numbers = " + Subtract(cpl1, cpl2));
		System.out.println("Mutiply of 2 complex numbers = " + Multi(cpl1, cpl2));
	}
}
