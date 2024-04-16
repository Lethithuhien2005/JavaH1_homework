package homework5;

public class Currency {
	private java.lang.String name;
	private double currentDollarRate;

	public Currency(String name, double currentDollarRate) {
		this.name = name;
		this.currentDollarRate = currentDollarRate;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public double getCurrentDollarRate() {
		return currentDollarRate;
	}

	public void setCurrentDollarRate(double currentDollarRate) {
		this.currentDollarRate = currentDollarRate;
	}

	@Override
	public String toString() {
		return "Currency: name=" + name + ", currentDollarRate=" + currentDollarRate;
	}
}
