package Eg_chapter5;

public class HotelExercise {
	public static void main(String[] args) {
		Room array[] = new Room[4];
		array[0] = new Room(2, false, true);
		array[1] = new Room(4, true, false);
		array[2] = new Room(4, false, false);
		array[3] = new Room(2, true, true);
		Hotel hotel = new Hotel(array, "Danang");
		System.out.println(hotel);
	}
}
