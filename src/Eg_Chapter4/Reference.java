package Eg_Chapter4;

import java.util.*;

public class Reference {
public static void main(String[] args) {
	Vector<String> vec = new Vector<String>(6);
	vec.addElement("Banana");
	vec.addElement("Watermelon");
	vec.addElement("Mango");
	vec.addElement("Apple");
	
	System.out.println("Size is: " + vec.size());
	System.out.println("Default capacity increment is: " + vec.capacity());
	
	vec.addElement("Grape");
	vec.addElement("Orange");
	vec.addElement("Clipart");

	System.out.println("Size after addition: " + vec.size());
	System.out.println("Capacity after increment is: " + vec.capacity());
	
	Enumeration<String> en = vec.elements();
	System.out.println("\nElements are: ");
	while (en.hasMoreElements()) {
		System.out.println(en.nextElement() + " ");
	}
}
}
