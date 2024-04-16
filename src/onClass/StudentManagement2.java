package onClass;

import java.util.Scanner;

public class StudentManagement2 {
	private int id;
	private String name;
	private double avr;

	public StudentManagement2() {

	}

public StudentManagement2(int id, String name, double avr) {
	this.id = id;
	this.name = name;
	this.avr = avr;
}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvr() {
		return avr;
	}

	public void setAvr(double avr) {
		this.avr = avr;
	}

	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ID: ");
		setId(sc.nextInt());
		System.out.println("nhap ten:");
		setName(sc.nextLine());
		String p = sc.next();
		System.out.println("nhap diem trung binh:");
		setAvr(sc.nextDouble());
	}

	public void Output() {
		System.out.println(getId() + "\t" + getName() + "\t" + getAvr() + "\t");
	}
}
