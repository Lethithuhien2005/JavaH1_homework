package Eg_Chapter6;

public class Manager extends Employee_ex3 {

	public Manager(String name, double age, double hourRate) {
		super(name, age, hourRate);
	}

	@Override
	public double Salary(double hours) {
		return hours * this.getHourRate() * 1.2;
	}
}
