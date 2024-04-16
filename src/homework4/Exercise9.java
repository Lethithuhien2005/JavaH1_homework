package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		int Array1[] = new int[] { 2, 3, 5, 3 };
		int Array2[] = new int[] { 2, 4, -5, -2 };
		System.out.print("Array1: ");
		System.out.print(Arrays.toString(Array1));
		System.out.println();
		System.out.print("Array2: ");
		System.out.println(Arrays.toString(Array2));
		System.out.print("Result:  ");
		int res=0;
		for (int k = 0; k < Array1.length; k++) {
			res=Array1[k]*Array2[k];
			System.out.print(res + " ");
		}
	}
}