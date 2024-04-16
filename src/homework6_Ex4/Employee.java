package homework6_Ex4;

import java.util.Scanner;

public abstract class Employee {
	private String name;
	private Date_of_birth date;
	private double factorSalary;
	public Employee() {
		
	}
	public Employee(String name, Date_of_birth date, double factorSalary) {
		this.name = name;
		this.date = date;
		this.factorSalary = factorSalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date_of_birth getDate() {
		return date;
	}
	public void setDate(Date_of_birth date) {
		this.date = date;
	}
	public double getFactorSalary() {
		return factorSalary;
	}
	public void setFactorSalary(double factorSalary) {
		this.factorSalary = factorSalary;
	}
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		setName(sc.nextLine());
		System.out.println("Date of birth: ");
//		System.out.println("day:");
//		setDay(sc.nextInt());
//		System.out.println("month:");
//		setMonth(sc.nextInt());
//		System.out.println("year:");
//		setYear(sc.nextInt());
//		Date_of_birth date = new Date_of_birth(day, 0, 0);

		System.out.println("Factor of salary:");
		setFactorSalary(sc.nextDouble());
	}
	public void display() {
		System.out.print(this.getName() + "\t");
		System.out.print("\t" + this.getFactorSalary());	
	}
	public abstract double Salary();
}
