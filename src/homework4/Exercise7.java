package homework4;

import java.util.Scanner;

public class Exercise7 {
	public static void Checklength(int[] arr) {
		while (arr.length < 2) {
			break;
		}
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = key.nextInt();
		int[] arr = new int[n];
		Checklength(arr);
		System.out.println("nhap phan tu cho mang:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = key.nextInt();
		}
		if(arr[0]==arr[arr.length-1]) {
			System.out.println("The first and the last element are same");
		} else {
			System.out.println("The first and the last element are not same");
		}
	}
}
