package homework4;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input a string:");
		String str = key.nextLine();
		System.out.println("Input a word: ");
		String s = key.nextLine();
		if (str.startsWith(s)) {
			System.out.println(" the first element of str is same the word");
		} else {
			System.out.println("the first element of str is not same the word");
		}
	}
}
