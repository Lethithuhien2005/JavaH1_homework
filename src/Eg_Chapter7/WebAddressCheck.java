package Eg_Chapter7;

import java.util.Scanner;

public class WebAddressCheck {
	public static void checkWebAddress(String s) throws WebAddressException {
		String numReg = "^https?://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%=]*)?&";
		boolean b = s.matches(numReg);
		if (b == false)
			throw new WebAddressException("Dia chi web khong hop le");
		else
			System.out.println("Dia chi web hop le");
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap dia chi web: ");
			String webadd = sc.nextLine();
			checkWebAddress(webadd);
		} catch (WebAddressException e) {
			System.out.println(e.getMessage());
		}
	}
}
