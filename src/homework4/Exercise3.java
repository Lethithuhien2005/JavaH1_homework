package homework4;

import java.util.Scanner;

public class Exercise3 {
	public static int count(String str) {
		int count = 0;
		if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					count++;
				}
			}
			count = count + 1;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = key.nextLine();
		System.out.println("words in string: " + count(str));
	}
}
