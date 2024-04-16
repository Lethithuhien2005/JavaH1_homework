package onClass;

import java.util.Scanner;

public class Student_onclass {
	private String id;
	private float aver;

	public Student_onclass() {

	}

	public Student_onclass(String id, float aver) {
		this.id = id;
		this.aver = aver;
	}

	public Student_onclass(Student_onclass s) {
		this.id = s.id;
		this.aver = s.aver;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getAver() {
		return aver;
	}

	public void setAver(float aver) {
		this.aver = aver;
	}
	public void Input() {
		Scanner key = new Scanner(System.in);
		System.out.println("ID=");
		this.id = key.next();
		System.out.println("Aver=");
		this.aver = Float.parseFloat(key.next());
	}
	public void Output() {
		System.out.println( this.getId() + "\t" + this.getAver());
	}
}
