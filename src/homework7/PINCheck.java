package homework7;

import java.util.Scanner;

public class PINCheck {
	public static void check(String s) throws PINException {
		String numReg = "^\\d{4}$";
		boolean b = s.matches(numReg);
		if (b == false) {
			throw new PINException("Chuoi da nhap khong dung "
					+ "dinh dang so PIN");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap chuoi so PIN: ");
			String chuoi = sc.nextLine();
			check(chuoi);
		} catch (PINException e) {
			System.out.println(e.getMessage());
		}
	}
}
