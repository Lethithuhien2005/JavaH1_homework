package homework6_Ex4;

import java.util.Scanner;

import Eg_Chapter4.CommonDivisor;

public class Exercise2_MyMath {
	public static int comDiv(int x, int y) {
		int max = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0 && y % i == 0) {
				max = i;
			}
		}
		return max;
	}

	public static double max(float a, float b, float c) {
		double Max = a;
		if (Max < b)
			Max = b;
		if (Max < c)
			Max = c;
		return Max;
	}

	public static double min(float A, float B, float C) {
		double min = A;
		if (min > B)
			min = B;
		if (min > C)
			min = C;
		return min;

	}

	public static boolean isPrimeNumber(int n) {
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static int sumRange(int N) {
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		return sum;
	}

	public static int abs(int X) {
		return Math.abs(X);
	}

	public static int round(float k) {
		return Math.round(k);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 number to find common divisor: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Common divisor is :  " + comDiv(x, y));
		System.out.println("--------------");
		System.out.println("Input 3 numbers to find max value ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		System.out.println("Max value is: " + max(a, b, c));
		System.out.println("--------------");
		System.out.println("Input 3 numbers to find min value ");
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		System.out.println("Min value is: " + min(A, B, C));
		System.out.println("--------------");
		System.out.println("Imput a number to check it is prime number or not");
		int n = sc.nextInt();
		System.out.println("The number is prime numner: " + isPrimeNumber(n));
		System.out.println("--------------");
		System.out.println("Input a number to calculate the sum 1 to this number");
		int N = sc.nextInt();
		System.out.println("Sum from 1 to " + N + " = " + sumRange(N));
		System.out.println("--------------");
		System.out.println("Input a number to calculate its abs");
		int X = sc.nextInt();
		System.out.println("abs=" + abs(X));
		System.out.println("--------------");
		System.out.println("Intput a float number to round");
		float k = sc.nextFloat();
		System.out.println("round = " + round(k));

	}
}
