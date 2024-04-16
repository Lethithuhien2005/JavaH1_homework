package Eg_Chapter7;

import java.util.Scanner;

public class CheckNumber {
	public static void CheckNumber(String s) throws UnsignedIntegerException {
		String numReg = "^\\d+$";
		boolean b = s.matches(numReg);
		// matches() : kiem tra xem mot chuoi co khop voi mot bieu thuc chinh quy khong
		if (b == false)
			throw new UnsignedIntegerException("Dinh dang chuoi so nguyen khong hop le");
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap chuoi so nguyen duong: ");
			String numStr = sc.nextLine();
			CheckNumber(numStr);
		} catch (UnsignedIntegerException e) {
			System.out.println(e.getMessage());
		}
	}
}
