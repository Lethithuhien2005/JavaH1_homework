package Eg_chapter5;

public class Room {
	private int beds;
	private boolean tv;
	private boolean telephone;

	public Room(int numofBeds, boolean tvExists, boolean telephoneExists) {
		beds = numofBeds;
		tv = tvExists;
		telephone = telephoneExists;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public boolean getTv() {
		return tv;
	}

	public void setTv(boolean tvExists) {
		tv = tvExists;
	}

	public boolean getTelephone() {
		return telephone;
	}

	public void setTelephone(boolean telephoneExists) {
		telephone = telephoneExists;
	}
	public String toString() {
		return "beds=" + beds + " tv=" + tv + " telephone=" + telephone + "\n";
	}
}
