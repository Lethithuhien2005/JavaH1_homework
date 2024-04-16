package homework1_2;

public class Company {
	private String name;
	private String address;
	private long cost;
	private long income;
	private long benefit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public long getIncome() {
		return income;
	}
	public void setIncome(long income) {
		this.income = income;
	}
	public long getBenefit() {
		return benefit;
	}
	public void setBenefit(long benefit) {
		this.benefit = benefit;
	}
	public Company(String name, String address, long cost, long income) {
		this.name = name;
		this.address = address;
		this.cost = cost;
		this.income = income;
		this.benefit = benefit;
	}
	public long Benefit() {
		return income-cost;
	}
	public void details() {
		System.out.println("Company's name: " + this.getName());
		System.out.println("Company's address: " + this.getAddress());
		System.out.println("cost: " + this.getCost());
		System.out.println("income: " + this.getIncome());
		System.out.println("benefit: " + this.Benefit());
	}
}
