package Eg_chapter2;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		int min, max, abs;
		max = Math.max(a, b);
		System.out.println(" Max of a, b is " + max);
		max = Math.max(max, c);
		System.out.println(" Max of a, b, c is " + max);
		min = Math.min(a, b);
		System.out.println(" Min of a, b is " + min);
		min = Math.min(min, c);
		System.out.println(" Min of a, b, c is " + min);
		System.out.println(" sqrt a = " + Math.sqrt(a));
		System.out.println(" sqrt b = " + Math.sqrt(b));
		System.out.println(" sqrt c = " + Math.sqrt(c));
		System.out.println(" power of a and b = " + Math.pow(a, b));
		System.out.println(" power of a and c = " + Math.pow(a, c));
		System.out.println(" power of b and c = " + Math.pow(b, c));
		System.out.println(" logarithm of a = " + Math.log(a));
		System.out.println(" logarithm of b = " + Math.log(b));
		System.out.println(" logarithm of c = " + Math.log(c));
		double goc1 = Math.toRadians(a);
		double sin = Math.sin(goc1);
		System.out.println(" sin " + a + "= " + sin);
		double goc2 = Math.toRadians(b);
		double cos = Math.cos(goc2);
		System.out.println(" cos " + b + "= " + cos);
		double goc3 = Math.toRadians(c);
		double tan = Math.tan(goc3);
		System.out.println(" tan " + c + "= " + tan);
		System.out.println(" Input a double n = ");
		Scanner keyboard = new Scanner(System.in);
		double n = keyboard.nextDouble();
		double round = Math.round(n * 100.0) / 100.0;
		System.out.println(" round " + n + " = " + round);
		double exp = Math.exp(n);
		System.out.println(" exp " + n + " = " + exp);
		

	}

}
