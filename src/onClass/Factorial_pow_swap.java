package onClass;

import java.util.Scanner;

public class Factorial_pow_swap {
	public static int Fact(int n) {
		int r = 1;
		for (int i =2; i<=n;i++) {
			r = r*i;
		}
		return r;
	}
	public static double Pow(int x, int n) {
		return Math.pow(x, n);
	}
	public static void Swap() {
		Scanner key = new Scanner(System.in);
		System.out.println("nhap a= ");
		int a = key.nextInt();
		System.out.println("nhap b= ");
		int b = key.nextInt();
		int t = a;
		a=b;
		b=t;
		System.out.println("a=" +a );
		System.out.println("b=" +b) ;
	}
	public static void main(String[] args) {
		System.out.println("factorial of 5: " + Fact(5));
		System.out.println("pow(2,10)=" + Pow(2, 10));
		Swap();
		
	}

}
