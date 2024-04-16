package homework5;

import java.util.Arrays;

public class Hotel {
	private Room[] rooms;
	private java.lang.String name;
	private Place place;

	public Hotel(Room[] rooms, String name, Place place) {
		this.rooms = rooms;
		this.name = name;
		this.place = place;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("place: ");
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