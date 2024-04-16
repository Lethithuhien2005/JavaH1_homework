package homework1_2;

import java.lang.*;
import java.util.*;

public class chapter2_Ex4 {
	public static void main(String[] args) {
// java.lang:

		// class StrignBuilder:

		StringBuilder str1 = new StringBuilder("welcome");
		System.out.println(str1);
		// append(String s) method
		System.out.println(str1.append(" to VKU"));
		// insert(int offset, String s) mehtod
		System.out.println(str1.insert(14, " university"));
		// delete(int startIndex, int endIndex) mehtod
		System.out.println(str1.delete(0, 10));
		// reverse()method
		System.out.println(str1.reverse());
		// length() method
		System.out.println(str1.length());

		// class Runtime

		// getRuntime() method
		Runtime run = Runtime.getRuntime();
		// freeMemory() method
		System.out.println("" + run.freeMemory());
		// Printing the number of free bytes
		System.out.println("" + run.getRuntime().freeMemory());
		// totalMemory()
		// Printing the number of total bytes
		System.out.println("" + run.getRuntime().totalMemory());
		// availableProcessors() method
		System.out.println(run.getRuntime().availableProcessors());

// java.util:		

		// class Locale

		Locale local1 = new Locale("VI", "KOREA");
		System.out.println("Local: " + local1);
		// getDisplayLanguage() method
		System.out.println("Language: " + local1.getDisplayLanguage());
		// getDisplayCountry() method
		System.out.println("Country: " + local1.getCountry());
		// hashCode() method
		System.out.println("HashCode for this locale:  " + local1.hashCode());
		// toString() mehtod
		System.out.println("String representation of locale1 " + local1.toString());
		// getDisplayName() method
		System.out.println("Name of local1 " + local1.getDisplayName());

	}
}
