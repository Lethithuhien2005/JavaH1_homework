package onClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentmain {
	private ArrayList<StudentManagement2> students;

	public Studentmain() {
		Scanner sc = new Scanner(System.in);
		students = new ArrayList<StudentManagement2>();
		while (true) {
			System.out.println("nhap lua chon cua ban:");
			System.out.println("1.nhap thong tin");
			System.out.println("2.xuat thong tin");
//			System.out.println("3.sap xep sach sinh vien tang dan diem trung binh");
//			System.out.println("4.tim sinh vien theo ten ");
//			System.out.println("5.thoat");
			System.out.println("-----------------");
			int choice = sc.nextInt();
//			if (choice == 3) {
//				break;
//			}
			switch (choice) {
			case 1: {
				input();
				break;
			}
			case 2: {
				output();
				break;
			}
			case 3: {
				break;
			}
			}
		}
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong hoc sinh:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			StudentManagement2 student = new StudentManagement2();
			student.Input();
			students.add(student);
		}
	}

	public void output() {
		System.out.println("ID\tName\tDTB");
		for (int i = 0; i < students.size(); i++) {
			students.get(i).Output();
		}
	}

	public static void main(String[] args) {
		new Studentmain();
	}
}
