package Eg_chapter3;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int N;
		int i;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("N= ");
		N = keyboard.nextInt();
		for (i = 2; i <= Math.round(Math.sqrt(N)); i++) 
			if (N % i == 0)
				break; /* Neu chia het cho mot so i thi N khong phai la so nguyen to */
			/*
			 * Neu i nho hon hoac bang 2 co nghia vong lap bi ket thuc bang cau lenh break
			 */
		if (i <= Math.round(Math.sqrt(N)))
			System.out.println("N is not a prime number ");
		else
			System.out.println(" N is a prime number ");
	}
}
