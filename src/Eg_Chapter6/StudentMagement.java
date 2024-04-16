package Eg_Chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import homework1_2.Student_;
import onClass.Student_onclass;

public class StudentMagement {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student_ex7> list = new ArrayList<Student_ex7>();

	public StudentMagement() {
		while (true) {
			System.out.println("*-CHUONG TRING QUAN LY SINH VIEN-*");
			System.out.println("*Chuc nang chinh chuong trinh-*");
			System.out.println("  1. Nhap danh sach sinh vien ");
			System.out.println("  2. Xem danh sach sinh vien ");
			System.out.println("  3. Sap xep danh sach sinh vien tang dan theo diem trung binh   ");
			System.out.println("  4. Tim sinh vien theo ten   ");
			System.out.println("  5. Thoat   ");
			System.out.println("  --------------- ");
			System.out.print(" nhap lua chon cua ban: ");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				this.Input();
				break;
			case 2:
				this.View();
				break;
			case 3:
				this.Sort();
				break;
			case 4:
				this.Search();
				break;
			case 5:
				System.out.println("---- Chuong tring ket thuc -----");
				return;
			}
		}
	}

	public void Input() {
		System.out.println("Nhap so luong sinh vien: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			Student_ex7 std = new Student_ex7();
			std.Input();
			list.add(std);
		}
	}

	public void View() {
		System.out.println("ID\tName\tAverage");
		for (int i = 0; i < list.size(); i++) {
			Student_ex7 std = list.get(i);
			std.display();
		}
		System.out.println();
	}

	public void Sort() {
		Collections.sort(this.list, new Comparator<Student_ex7>() {

			@Override
			public int compare(Student_ex7 std1, Student_ex7 std2) {
				return (int) (std1.getAver() - std2.getAver());
			}
		});
	}
	public void Search() {
		System.out.println("Nhap ten sinh vien can tim kiem: ");
		String name = sc.next();
		for (int i = 0; i < list.size(); i++) {
			Student_ex7 std = list.get(i);
			if (std.getName().equals(name)) {
				System.out.println("ID\tName\tAverage");
				std.display();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StudentMagement std = new StudentMagement();
	}

}
