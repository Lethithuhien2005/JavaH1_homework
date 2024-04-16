package onClass;

import java.util.ArrayList;

import java.util.Scanner;

public class StudentManagement_onclass {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student_onclass> list = new ArrayList<Student_onclass>();

	public StudentManagement_onclass() {
		while (true) {
			System.out.println("Enter your choice:");
			System.out.println("1.Input student's information");
			System.out.println("2.Display list of student");
			System.out.println("3.Search student by ID");
			System.out.println("4.Search student by average");
			System.out.println("Input n= ");
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				this.Input();
				break;
			}
			case 2: {
				this.View();
				break;
			}
			case 3: {
				this.SearchID();
				break;
			}
			case 4: {
				this.SearchAverage();
			}
			default:
				System.out.println("no chosen");
				break;
			}
		}
	}

	public void Input() {
		System.out.println("Input number of student: ");
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			Student_onclass sv = new Student_onclass();
			sv.Input();
			list.add(sv);
		}
		System.out.println();
	}

	public void View() {
		System.out.println("ID\tAverage");
		for (int i = 0; i < list.size(); i++) {
			Student_onclass st = list.get(i);
			st.Output();
		}
		System.out.println();
	}

	public void SearchID() {
		System.out.println("Input ID: ");
		String id = sc.next();
		for (int i = 0; i < list.size(); i++) {
			Student_onclass st = list.get(i);
			if (st.getId().equals(id)) {
				st.Output();
			}
		}
		System.out.println();
	}
	public void SearchAverage() {
		System.out.println("Input average: ");
		float avr = sc.nextFloat();
		for (int i = 0; i < list.size(); i++) {
			Student_onclass st = list.get(i);
			if (st.getAver()==(avr)) {
				st.Output();
			}
		}
		System.out.println();
	}
	public void Sort() {
		
	}

	public static void main(String[] args) {
		StudentManagement_onclass std = new StudentManagement_onclass();

	}
}
