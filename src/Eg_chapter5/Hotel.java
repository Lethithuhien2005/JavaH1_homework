package Eg_chapter5;

import java.util.Arrays;

public class Hotel {
	private Room[] rooms;
	private String place;

	Hotel(Room vec[]) {
		rooms = vec;
	}

	public Hotel(Room vec[], String place) {
		rooms = vec;
		this.place = place;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room vec[]) {
		rooms = vec;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(place);
		sb.append("\n");
		for (int i = 0; i < rooms.length; i++) {
			sb.append("room num.");
			sb.append(i + 1);
			sb.append(":");
			sb.append(rooms[i]);
		}
		return sb.toString();
	}

}
