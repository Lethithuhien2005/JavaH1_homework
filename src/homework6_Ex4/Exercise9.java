package homework6_Ex4;

import java.util.Scanner;

public class Exercise9 {
	private String name;
	private int age;
	private float average;
	private double math;
	public Exercise9 () {
		
	}

	public Exercise9(String name, int age, float average, double math) {
		super();
		this.name = name;
		this.age = age;
		this.average = average;
		this.math = math;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		this.name = sc.nextLine();
		System.out.println("Age: ");
		this.age = sc.nextInt();
		System.out.println("Math: ");
		this.math = sc.nextDouble();
		System.out.println("Average: ");
		this.average = sc.nextFloat();
	}
	public void display() {
		System.out.println(this.getName() + "\t" + this.getAge() + "\t" + this.getMath() + "\t"+ this.getAverage());
	}
}
