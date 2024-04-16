package homework6_Ex4;

import java.util.Scanner;

public class Clerk extends Employee {
	private String department;

	public Clerk() {
		
	}
	public Clerk(String name, Date_of_birth date, double factorSalary, String department) {
		super(name, date, factorSalary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void Input() {
		super.Input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Department: ");
		setDepartment(sc.nextLine());
	}

	@Override
	public void display() {
		super.display();
		System.out.println("\t" + this.getDepartment());
	}
	@Override
	public double Salary() {
		return getFactorSalary()*1150000;
	}
}
