package homework4;

import java.util.Scanner;

public class Exercise4 {
	public static int Sum(int n) {
		int sum = 0;
		int i;
		while (n != 0) {
			i = n % 10;
			sum += i;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input a integer : ");
		int n = key.nextInt();
		System.out.println("sum of the digits in integer = " + Sum(n));
	}

}
