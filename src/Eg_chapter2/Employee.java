package Eg_chapter2;

public class Employee {
	String id;
	String name;
	String department;
	double salary;

	public Employee (String id, String name, String dep, double sal) {
		this.id = id;
		this.name = name;
		department = dep;
		salary = sal;
	}

	public void setId(String val) {
		id = val;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		name = name;
	}

	public String getName() {
		return name;
	}

	public void setDepartment(String department) {
		department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setSalary(double salary) {
		salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void details() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);

	}
}

class Manager extends Employee {
	String title;
	double position_allowance;

	public Manager(String id, String name, String dep, double sal, String tit, double pa) {
		super(id,name,dep,sal);
		title = tit;
		position_allowance = pa;
		
	}

	public void setTitle(String val) {
		title = val;
	}

	public String getTitle() {
		return title;
	}

	public void setPosition_allowance(double position_allowance) {
		position_allowance = position_allowance;
	}

	public double getPosition_allowance() {
		return position_allowance;
	}
	public void details() {
		super.details();
		System.out.println("Title: " + title);
		System.out.println("Position allowance: " + position_allowance);
	}
}

	