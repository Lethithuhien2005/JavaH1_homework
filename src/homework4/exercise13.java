package homework4;

import java.util.*;

public class exercise13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Nhap phan tu cua mang:");
		for (int i=0;i<n;i++) {
			System.out.println("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
