package homework7;

import java.util.Scanner;

public class Age {
	public static void checkAge(int age) throws AgeException {
		if (age < 1) {
			throw new AgeException("The age is not valid");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input age: ");
			int age = sc.nextInt();
			checkAge(age);
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
