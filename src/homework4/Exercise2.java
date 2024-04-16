package homework4;

import java.util.Scanner;

public class Exercise2 {
	public static int Count(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='u' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='a' || str.charAt(i)=='i') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = key.nextLine();
		System.out.println("vowels in string: " + Count(str));
	}
}
