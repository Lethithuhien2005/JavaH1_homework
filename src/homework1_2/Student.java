package homework1_2;

import java.util.*;

public class Student {
//data/attributes/
	String name;
	Date birthday;
	String address;
	float AverMark;

//methods/operations

	public void input() {
		Scanner key = new Scanner(System.in);
		System.out.print("Input student name = ");
		name = key.nextLine();
		System.out.print("Input birthday = ");
		System.out.print("Day = ");
		int day = key.nextInt();
		System.out.print("Month = ");
		int month = key.nextInt();
		System.out.print("Year = ");
		int year = key.nextInt();
		birthday = new Date(year, month, day);

		key.nextLine();// clear buffer
		System.out.print("Address = ");
		address = key.nextLine();

		System.out.print("Aver mark = ");
		AverMark = key.nextFloat();
	}

//methods/operations
	public void output() {
		System.out.println("\nName:" + name + "\nAddress:" + address + "\nBirthyear: " + birthday.getYear()
				+ "\nAverage mark: " + AverMark);
	}

	public static void main(String[] args) {

		Student A = new Student();
		A.input();
		A.output();
	}
}