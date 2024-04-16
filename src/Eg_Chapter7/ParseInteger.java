package Eg_Chapter7;

import java.util.*;
import java.util.Scanner;

public class ParseInteger {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap chuoi so nguyen: ");
			String str = sc.nextLine();
			
			int num = Integer.parseInt(str);
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println("Chuoi nhap vao khong dung dinh dang");
		}
	}
}