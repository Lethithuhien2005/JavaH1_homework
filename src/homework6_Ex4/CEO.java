package homework6_Ex4;

import java.util.Scanner;

public class CEO extends Employee {
	private double factorPosition;
	public CEO() {
		
	}
	public CEO(String name, Date_of_birth date, double factorSalary, double factorPosition) {
		super(name, date, factorSalary);
		this.factorPosition = factorPosition;
	}
	public double getFactorPosition() {
		return factorPosition;
	}
	public void setFactorPosition(double factorPosition) {
		this.factorPosition = factorPosition;
	}

	@Override
	public void Input() {
		super.Input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Factor of position:");
		setFactorPosition(sc.nextDouble());
	}
	@Override
	public void display() {
		super.display();
		System.out.println("\t" + this.getFactorPosition());
	}	
	@Override
	public double Salary() {
		return (getFactorSalary() + getFactorPosition())*1150000;
	}
}
