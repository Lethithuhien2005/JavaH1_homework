
	package homework5;

import java.util.Date;

public class VactionExercise {
	public static void main(String[] args) {
		Date date = new Date();
		Vacation vac = new Vacation(2, date, "Da Nang" );
		System.out.println(vac.toString());
	}
}
