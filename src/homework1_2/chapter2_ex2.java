package homework1_2;

public class chapter2_ex2 {
	public static void main(String[] args) {
		StringBuffer StrB1 = new StringBuffer("welcome to VKU ");
		System.out.println(StrB1);
		// append() method
		StrB1.append("Java");
		System.out.println(StrB1);
		// insert() method
		StringBuffer StrB2 = new StringBuffer("I love programming language");
		StrB2.insert(7, " java ");
		System.out.println(StrB2);
		// delete() method
		StrB2.delete(1, 9);
		System.out.println(StrB2);
		// reverse() method
		StrB2.reverse();
		System.out.println(StrB2);
		// capacity() method
		StringBuffer StrB3 = new StringBuffer("Hello");
		System.out.println(StrB3.capacity());
		StrB3.append("Java");
		System.out.println(StrB3.capacity());
		// ensureCapacity() method
		StrB3.ensureCapacity(10);
		System.out.println(StrB3.capacity());
		StrB3.ensureCapacity(50);
		System.out.println(StrB3.capacity());
		// deletecharAt() method
		StrB3.deleteCharAt(5);
		System.out.println(StrB3);
		// length() method
		System.out.println("length of StrB3: " + StrB3.length());
		// getChars() method
		char[] ch = new char[10];
		StrB3.getChars(2, 5, ch, 0);
		System.out.println(StrB3);
		// lastindexOf() method
		System.out.println(StrB3.lastIndexOf("h"));

	}
}
