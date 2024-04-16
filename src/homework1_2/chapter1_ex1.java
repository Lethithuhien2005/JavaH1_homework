package homework1_2;

import java.util.Scanner;

public class chapter1_ex1 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("input n = ");
		double n = key.nextDouble();
		double goc = Math.toRadians(n);	// doi do sang radian
		double sin = Math.sin(goc);
		System.out.println(" sin(" + n + ")" + " = " + sin);
		double cos = Math.cos(goc);
		System.out.println(" cos(" + n + ")" + " = " + cos);
		double sqrt = Math.sqrt(n);
		System.out.println(" sqrt( " + n + ")" + " = " + sqrt);
	}
}
