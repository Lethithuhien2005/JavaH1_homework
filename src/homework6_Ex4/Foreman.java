package homework6_Ex4;

import java.util.Scanner;

public class Foreman extends Employee {
	private double salary;
	public Foreman() {
		
	}
	
	public Foreman(String name, Date_of_birth date, double factorSalary, double salary) {
		super(name, date, factorSalary);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void Input() {
		super.Input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Salary: ");
		setSalary(sc.nextDouble());
	}

	@Override
	public void display() {
		super.display();
		System.out.println("\t" + this.getSalary());
	}
	@Override
	public double Salary() {
		return getFactorSalary()*1150000;
	}
}
