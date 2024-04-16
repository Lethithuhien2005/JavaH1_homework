package Eg_Chapter6;

import java.util.Scanner;

public class Student_ex7 {
	private String id;
	private String name;
	private float aver;

	public Student_ex7 () {
		
	}
	public Student_ex7(String id, String name, float aver) {
		this.id = id;
		this.name = name;
		this.aver = aver;
	}

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

	public float getAver() {
		return aver;
	}

	public void setAver(float aver) {
		this.aver = aver;
	}

	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ID: ");
		setId(sc.nextLine());
		System.out.println("nhap ten:");
		setName(sc.nextLine());
		System.out.println("nhap diem trung binh:");
		setAver(sc.nextFloat());
	}
	public void display() {
		System.out.println(this.getId() + "\t" + this.getName() + "\t" + this.getAver() + "\t");
	}
}
