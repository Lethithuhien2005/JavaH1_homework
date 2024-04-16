package homework4;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise14 {
	public static void main(String[] args) {
		String[] arr1 = new String[] { "Python", "JAVA", "PHP", "C#", "SQL" };
		String[] arr2 = new String[] { "MySQL", "SQL", "Oracle", "PostgreSQL", "DB2", "JAVA" };
		System.out.println("Array1: "  + Arrays.toString(arr1));
		System.out.println("Array2: " + Arrays.toString(arr2));
		HashSet<String> arr3 = new HashSet<String>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i].equals(arr2[j])) {
					arr3.add(arr1[i]);
				}
			}
		}
		System.out.println("Comon element is: " + arr3);

	}
}
