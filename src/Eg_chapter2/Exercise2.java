package Eg_chapter2;

public class Exercise2 {
	public static void main(String[] args) {
		String str1 = new String("VKU is one of the best of universities in Vietnam ");
		String str2 = new String("Prof. Phap is an OOP teacher");
		// lenght method
		System.out.println("str1 contains " + str1.length() + " characters");
		// compareTo method
		int n = (str1).compareTo(str2);
		if (n > 0)
			System.out.println("str1 is greater than str2 ");
		else if (n == 0)
			System.out.println("str1 is equal to str2 ");
		else
			System.out.println("str1 is less than str2 ");
		// charAt method
		System.out.println("the character at str1 " + str1.charAt(5));
		// codePointAt method
		System.out.println("the UNICODE of character at str1 " + str1.codePointAt(10));
		// codePointBefore method
		System.out.println("the UNICODE of character before at str2 " + str2.codePointBefore(10));
		// codePointCount method
		System.out.println("the number of the UNICODE values found in str2 " + str2.codePointCount(0, 28));
		// compareToIgnoreCase method
		int k = (str1).compareToIgnoreCase(str2);
		if (n > 0)
			System.out.println("str1 is greater than str2 ");
		else if (n == 0)
			System.out.println("str1 is equal to str2 ");
		else
			System.out.println("str1 is less than str2 ");
		// concat method
		str1.concat(str2);
		System.out.println(str1);
		// contains method
		System.out.println(str1.contains("VKU"));
		System.out.println(str2.contains("Vietnam"));
		// endswith method
		System.out.println("the end charaters of str1 is universities " + str1.endsWith("universities"));
		System.out.println("the end charaters of str2 is teacher " + str2.endsWith("teacher"));
	}
}
