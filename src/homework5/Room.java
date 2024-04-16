package homework5;

public class Room {
	private int beds;
	private boolean tv;
	private boolean telephone;

	public Room(int beds, boolean tv, boolean telephone) {
		this.beds = beds;
		this.tv = tv;
		this.telephone = telephone;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public boolean isTelephone() {
		return telephone;
	}

	public void setTelephone(boolean telephone) {
		this.telephone = telephone;
	}
}
