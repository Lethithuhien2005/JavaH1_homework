package Eg_Chapter6;

public class AbstractEmployee {
	public static void main(String[] args) {
		Employee_ex3 vec[] = { new Manager("HCPHAP", 45, 104), new Clerk("John Le", 26, 110),
				new Manager("David Huynh", 42, 120), new Manager("Marry Nguyen", 34, 120) };
		double hours[] = { 140, 150, 130, 180 };
		double total = 0;
		for (int i = 0; i < vec.length; i++) {
			total += vec[i].Salary(hours[i]);
			System.out.println(vec[i]);
			System.out.println("The total payment of the employee is " + total);
		}
	}
}
