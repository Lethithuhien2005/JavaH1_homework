package homework7;

import java.util.Scanner;

public class PhoneCheck {
	public static void checkPhone(String s) throws PhoneException {
		String numReg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|"
				+ "(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
		boolean b = s.matches(numReg);
		if (b == false) {
			throw new PhoneException("So dien thoai khong hop le");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap so dien thoai: ");
			String phone = sc.nextLine();
			checkPhone(phone);
		} catch (PhoneException e) {
			System.out.println(e.getMessage());
		}
	}
}
