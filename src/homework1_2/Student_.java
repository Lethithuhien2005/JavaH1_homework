package homework1_2;

import java.util.Scanner;

public class Student_ {
	private String name;
	private int age;
	private String address;
	private double math;
	private double physics;
	private double chemistry;
	private double average;

	public Student_(String name, int age, String address, double math, double physics, double chemistry) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public double Average() {
		return (math + physics + chemistry) / 3;

	}

	public void Details() {
		System.out.println("name: " + this.getName());
		System.out.println("age: " + this.getAge());
		System.out.println("address: " + this.getAddress());
		System.out.println("math mark: " + this.getMath());
		System.out.println("physics mark: " + this.getPhysics());
		System.out.println("chemistrythis mark: " + this.getChemistry());
		System.out.println("average: " + this.Average());

	}

	public void Ouput() {
		this.Details();
	}
}
