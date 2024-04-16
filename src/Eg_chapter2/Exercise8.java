package Eg_chapter2;

public class Exercise8 {
	public static void main(String[] args) {
		Employee A = new Employee("VKU01", "David Tho", "Academic Office", 10000);
		Manager B = new Manager("VKU02", "Jonh Phap", "Steering Board", 10000, "Rector", 10000);
		A.details();
		System.out.println("----------------");
		B.details();
	}
}
