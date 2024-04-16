package Eg_Chapter6;

public abstract class Employee_ex3 {
	private String name;
	private double age;
	private double hourRate;

	public Employee_ex3(String name, double age, double hourRate) {
		this.name = name;
		this.age = age;
		this.hourRate = hourRate;
	}

	public String getName() {
		return name;
	}

	public double getHourRate() {
		return hourRate;
	}

	public String toString() {
		return "name: " + this.getName() + " ,age=" + this.name + " ,hourRate= " + this.hourRate;
	}

	public abstract double Salary(double hours);
}
