package Eg_Chapter6;

public class Employee extends Person {
private float salary;
private float rate;
public Employee(String name, int age, String address, float salary, float rate) {
	super(name, age, address);
	this.salary = salary;
	this.rate = rate;
} 
public float totalSalary() {
	return this.salary*this.rate;
}
public void display() {
	super.display();
	System.out.print(" co tong luong la: " + totalSalary());
}
}
