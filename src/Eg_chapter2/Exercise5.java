package Eg_chapter2;

import java.time.LocalDate; // import the LocalDate class

public class Exercise5 {
	public static void main(String[] args) {
		// now() method
		LocalDate myObj = LocalDate.now();
		System.out.println("current day is: " + myObj);
		// of(year, month, dayofmonth) method
		LocalDate date1 = LocalDate.of(2023, 10, 4);
		System.out.println(date1);
		// getYear() method
		int year = date1.getYear();
		System.out.println("year: " + year);
		// getDayOfMonth() method
		int dayOfMonth = date1.getDayOfMonth();
		System.out.println("day of month: " + dayOfMonth);
		// plusDays(daysToAdd) method
		LocalDate newdate1 = date1.plusDays(10);
		System.out.println("new day after add 10 days: " + newdate1);
		// minusDays(daysToSubtract) method
		LocalDate newdate2 = date1.minusDays(5);
		System.out.println("new date after subtract 5 days: " + newdate2);
		// isEqual(otherDate) method
		boolean equal = date1.isEqual(newdate1);
		System.out.println(equal);
		// isBefore(otherDate) method
		boolean before = date1.isBefore(newdate2);
		System.out.println(before);
		// isAfter(otherDate) method
		boolean after = date1.isAfter(newdate2);
		System.out.println(after);
		// isLeapYear() method
		LocalDate date2 = LocalDate.of(2023, 8, 25);
		boolean leapyear = date2.isLeapYear();
		System.out.println(leapyear);
	}
}
