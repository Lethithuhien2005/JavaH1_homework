package Eg_chapter2;

import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow.getTime());
		System.out.println(rightNow.getTimeZone());
		System.out.println(rightNow.getWeekYear());
		System.out.println(" day: " + rightNow.get(rightNow.DATE));
		System.out.println(" month: " + rightNow.get(rightNow.MONTH));
		System.out.println(" year: " + rightNow.get(rightNow.YEAR));
		int maximum = rightNow.getMaximum(rightNow.DAY_OF_WEEK);
	}
}
