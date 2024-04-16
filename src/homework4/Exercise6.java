package homework4;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = key.nextInt();
		int arr[] = new int[n];
		System.out.println("Nhap cac phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("arr[" + i + "]=");
			arr[i] = key.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}