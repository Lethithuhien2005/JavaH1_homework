package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		double min;
		double max;
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cho mang: ");
		int n = key.nextInt();
		double arr[] = new double[n];
		System.out.println("Nhap phan tu cho mang: ");
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = key.nextDouble();
		}
		System.out.println(Arrays.toString(arr));
		min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("minimum value of arr: " + min);
		max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("maximum value of arr: " + max);
	}
}
