package homework1_2;

import java.util.Scanner;

public class chapter1_ex2 {
	public static int CountCha(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String str;
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Input characters: ");
		str = keyboard.nextLine();
		System.out.println(" count characters = " + CountCha(str));
	}
}