package Eg_Chapter4;

import java.util.Scanner;

public class StringProcess {
	public static void main(String[] args) {
		String s = "Write a Java program very easily";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("so luong ky tu a co trong chuoi = " + count);
		int index = s.indexOf("Java");
		if (index >= 0) {
			System.out.println("Tu java dau tien cua chuoi o vi tri: " + index);
		} else {
			System.out.println("Chuoi khong chua tu Java");
		}
		if (s.startsWith("Write") == true) {
			System.out.println("Tu Write bat dau chuoi");
		} else
			System.out.println("Tu Write khong bat dau chuoi");
		if (s.endsWith("easily") == true) {
			System.out.println("Tu easily ket thuc chuoi ");
		} else
			System.out.println("Tu easily khong ket thuc chuoi");

	}
}
