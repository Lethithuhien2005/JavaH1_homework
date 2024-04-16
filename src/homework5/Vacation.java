package homework5;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Vacation {
	private int length;
	private java.util.Date date;
	private String place;

	public Vacation(int length, Date date, String place) {
		this.length = length;
		this.date = date;
		this.place = place;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;

	}

	@Override
	public String toString() {
		return "Vacation: length=" + this.getLength() + ", date=" + this.getDate() + ", place=" + this.getPlace();
	}
}
