package homework6_Ex4;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
	ArrayList<CEO> list = new ArrayList<CEO>();
	ArrayList<Foreman> listF = new ArrayList<Foreman>();
	ArrayList<Clerk> listC = new ArrayList<Clerk>();
	Scanner sc = new Scanner(System.in);

	public EmployeeManagement() {
		while (true) {
			System.out.println("1. Input data including: 1 CEO, 2 Foreman, N(N>5) Clerk");
			System.out.println("2. Display information about all employees");
			System.out.println("3. Display the employee has max salary");
			System.out.println("4. Display the emplyee was born in 12");
			System.out.println("5. Display all of employees belong Accounting Room");
			System.out.println("6. Display the employee has last name 'Huynh' ");
			System.out.println("Your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				this.Input();
				break;
			case 2:
				this.Output();
				break;
			case 3:
				this.MaxSalary();
				break;
			case 4:
				this.Display12();
				break;
			case 5:
				this.DisplayAcount();
				break;
			case 6:
				this.displayHuynh();
				break;
			default:
				break;
			}
		}
	}

	public void Input() {
		CEO c = new CEO();
		System.out.println("Input CEO's information");
		c.Input();
		System.out.println("Input 2 foreman's information");
		for (int i = 0; i < 2; i++) {
			Foreman f = new Foreman();
			f.Input();
			listF.add(f);
		}
		int n;
		do {
			System.out.println("Input the number of clerks");
			n = sc.nextInt();
		} while (n < 0);
		for (int i = 0; i < n; i++) {
			Clerk cl = new Clerk();
			cl.Input();
			listC.add(cl);
		}
	}

	public void Output() {
		System.out.println("Name\tDate of birth\tFactor of salary\tFactor of position\tSalary of Foreman");
		for (int i=0; i<list.size(); i++) {
			CEO c = list.get(i);
			c.display();
		}
	
		for (int i = 0; i < listF.size(); i++) {
			Foreman f = listF.get(i);
			f.display();
		}
		for (int i = 0; i < listC.size(); i++) {
			Clerk cl = listC.get(i);
			cl.display();
		}
	}

	public void MaxSalary() {
		double max = 0;
		for (int i = 0; i < list.size(); i++) {
			CEO c = list.get(i);
			if (c.Salary() > max) {
				max = c.Salary();
			}
		}
		for (int i = 0; i < listF.size(); i++) {
			Foreman f = listF.get(i);
			if (f.Salary() > max) {
				max = f.Salary();
			}
		}
		for (int i = 0; i < listC.size(); i++) {
			Clerk cl = listC.get(i);
			if (cl.Salary() > max) {
				max = cl.Salary();
			}
		}
		for (int i = 0; i < list.size(); i++) {
			CEO c = list.get(i);
			if (c.Salary() == max) {
				c.display();
			}
		}
		for (int i = 0; i < listF.size(); i++) {
			Foreman f = listF.get(i);
			if (f.Salary() == max) {
				f.display();
			}
		}
		for (int i = 0; i < listC.size(); i++) {
			Clerk cl = listC.get(i);
			if (cl.Salary() == max) {
				cl.display();
			}
		}
	}

	public void Display12() {
		for (int i = 0; i < list.size(); i++) {
			CEO c = list.get(i);
			if (c.getDate().getMonth() == 12) {
				c.display();
			}
		}
		for (int i = 0; i < listF.size(); i++) {
			Foreman f = listF.get(i);
			if (f.getDate().getMonth() == 12) {
				f.display();
			}
		}
		for (int i = 0; i < list.size(); i++) {
			Clerk cl = listC.get(i);
			if (cl.getDate().getMonth() == 12) {
				cl.display();
			}
		}
	}

	public void DisplayAcount() {
		String dep = "Acounting";
		for (int i = 0; i < list.size(); i++) {
			Clerk cl = listC.get(i);
			if (cl.getDepartment().equals(dep)) {
				cl.display();
			}
		}
	}

	public void displayHuynh() {
		String name = "Huynh";
		for (int i = 0; i < listC.size(); i++) {
			Clerk cl = listC.get(i);
			if (cl.getName().equals(name)) {
				cl.display();
			}
		}
	}

	public static void main(String[] args) {
		EmployeeManagement e = new EmployeeManagement();
	}
}
