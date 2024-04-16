package Eg_Chapter7;

import java.util.Scanner;

public class EmailCheck {
	public static void check(String str) throws EmailAddressException {
		int place = str.indexOf('@');
		if (place==-1) {
			throw new EmailAddressException("Khong hop le do khong chua '@'");
		}
		if (place==0) {
			throw new EmailAddressException("Khong hop le do '@' o vi tri dau tien ");
		}
		place = str.indexOf('@', place+1);
		if (place!=-1) {
			throw new EmailAddressException("Khong hop le do co hon 1 '@'");
		}
		System.out.println("Dia chi email hop le");
	}
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap dia chi email: ");
			String email = sc.nextLine();
			check(email);
		}
		catch (EmailAddressException e) {
			System.out.println(e.getMessage());
		}
	}
}
