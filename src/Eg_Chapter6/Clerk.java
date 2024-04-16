package Eg_Chapter6;

public class Clerk extends Employee_ex3{

	public Clerk(String name, double age, double hourRate) {
		super(name, age, hourRate);
	}

	@Override
	public double Salary(double hours) {
		return hours*this.getHourRate()*0.8;
	}
}
