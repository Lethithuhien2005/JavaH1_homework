package homework5;

public class HotelExercise {
	public static void main(String[] args) {
		Room room[] = new Room[5];
		room[0] = new Room(2, true, false);
		room[1] = new Room(1, false, true);
		room[2] = new Room(1, true, true);
		room[3] = new Room(2, false, false);
		room[4] = new Room(1, true, true);
		Currency cur = new Currency("Pound", 1.22);
		Place place = new Place("Seoul", "Korea", cur, "null");
		Hotel hol = new Hotel(room, "BTS", place);
		System.out.println(hol);
	}
}
