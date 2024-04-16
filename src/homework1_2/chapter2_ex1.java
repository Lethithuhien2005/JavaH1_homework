package homework1_2;

public class chapter2_ex1 {
	public static void main(String[] args) {
		// isLetter() method
		Character ch = new Character('a');
		boolean isLetter = Character.isLetter(ch);
		System.out.println(isLetter);
		// isDigit() method
		boolean isDigit = Character.isDigit(ch);
		System.out.println(isDigit);
		// isWhitespace() method
		boolean isWhitespace = Character.isWhitespace(ch);
		System.out.println(isWhitespace);
		// isUpperCase() method
		boolean isUpperCase = Character.isUpperCase('A');
		System.out.println(isUpperCase);
		// isLowerCase() method
		boolean isLowerCase = Character.isLowerCase('B');
		System.out.println(isLowerCase);
		// toUpperCase() method
		char toUpperCase = Character.toUpperCase(ch);
		System.out.println("convert " + ch + " to Uppercase: " + toUpperCase);
		// toLowerCase() mehtod
		char toLowerCase = Character.toLowerCase('C');
		System.out.println("convert " + 'C' + " to Lowercase: " + toLowerCase);
		// equals() method
		Character ch1 = new Character('d');
		Character ch2 = new Character('f');
		boolean equals = ch1.equals(ch2);
		System.out.println(equals);
		// compareTo() method
		Character ch3 = new Character('h');
		Character ch4 = new Character('k');
		int compareTo = ch3.compareTo(ch4);
		System.out.println(compareTo);
		// toString() method
		String chartoString = Character.toString(ch);
		System.out.println(chartoString);

	}

}
