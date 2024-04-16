package Eg_chapter5;

import java.util.Scanner;

public class MyMath {
	public static long factorial(int num) {
		long result = 1;
		for (int i = 2; i <= num; i++) {
			result *= i;
		}
		return result;
	}

	public static boolean isPrime(int number) {
		long numberSqrt = (long)Math.sqrt(number);
		boolean result = true;
		for (int i = 1; i < numberSqrt && result; i++) {
			if (number % i == 0) return false;
		}
		return true;
	}
	public static boolean isTriangle(double num1, double num2, double num3) {
		return (num1>(num2 + num3) && num2>(num1 + num3) && num3>(num1 + num2));
	}
}
	
