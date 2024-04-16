package homework4;

import java.util.Scanner;

public class Exercise8 {
public static void main(String[] args) {
	Scanner key = new Scanner(System.in);
	System.out.println("Nhap so luong phan tu cua mang: ");
	int n = key.nextInt();
	System.out.println("nhap phan tu cho mang:");
	int arr[] = new int[n];
	for (int i =0; i<arr.length;i++) {
		System.out.print("arr[" + i + "]=");
		arr[i]=key.nextInt();
	}
	System.out.println("day ban dau la: ");
	for (int i=0; i<arr.length;i++) {
		System.out.print(arr[i]);
	}
	System.out.println();
	int t = arr[0];
	arr[0]=arr[arr.length-1];
	arr[arr.length-1]=t;
	System.out.println("day sau khi doi:");
	for (int i=0;i<arr.length;i++) {	
		System.out.print(arr[i]);
	}				
}
}
