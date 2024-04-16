package homework1_2;

import java.util.Scanner;

public class employee {
	private String id;
	private String name;
	private String department;
	private double salary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		
		this.salary = salary;
	}
	public void Input() {
		Scanner key = new Scanner(System.in);
		System.out.println( " id:");
		this.id=key.nextLine();
		System.out.println(" name:");
		this.name=key.nextLine();
		System.out.println(" department:");
		this.department=key.nextLine();
		System.out.println("salary:");
		this.salary=key.nextDouble();	}
	public double Salary() {
		return 1800000*salary;
	}
	public void Detail() {
		System.out.println(this.getId());
		System.out.println(this.getName());
		System.out.println(this.getDepartment());
		System.out.println(this.Salary());
		
	}
	public void Output() {
		this.Detail();
		
	}
}
