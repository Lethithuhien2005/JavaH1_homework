package homework7;

import java.util.Scanner;

public class Integercheck {
	public static void Check(String s) throws IntegerException {
		String numReg = "^-?\\d+$";
		boolean b = s.matches(numReg);
		if (b == false) {
			throw new IntegerException("Chuoi so nguyen khong dung dinh dang");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap chuoi so nguyen: ");
			String number = sc.nextLine();
			Check(number);
		} catch (IntegerException e) {
			System.out.println(e.getMessage());
		}
	}
}
