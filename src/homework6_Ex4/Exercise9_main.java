package homework6_Ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise9_main {

	ArrayList<Exercise9> list = new ArrayList<Exercise9>();
	Scanner sc = new Scanner(System.in);
	
public Exercise9_main() {
	while (true) {
		System.out.println("1. Input value for student");
		System.out.println("2. Display list of students");
		System.out.println("3. Arrange ascending the average");
		System.out.println("4. Display the student has max Math");
		System.out.println("5. Display all of students > 23 years old");
		System.out.println("6. Display all of students has last name 'Huynh'");
		System.out.println("Your choice:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			this.Input();
			break;
		case 2:
			this.Output();
			break;
		case 3:
			this.sort();
			break;
		case 4:
			this.MaxMath();
			break;
		case 5:
			this.Display23();
			break;
		case 6:
			this.displayHuynh();
			break;
		default:
			break;
		}
	}
}
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of students: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Exercise9 std = new Exercise9();
			std.Input();
			list.add(std);
		}
	}

	public void Output() {
		System.out.println("name\t\tage\taverage");
		for (int i = 0; i < list.size(); i++) {
			Exercise9 std = list.get(i);
			list.get(i).display();
		}
	}

	public void displayHuynh() {
		for (int i = 0; i < list.size(); i++) {
			Exercise9 std = list.get(i);
			if (std.getName().startsWith("Huynh")) {
				System.out.println("Display person has name: Huynh");
				System.out.println("name\t\tage\tmath\taverage");
				std.display();
			}

		}
	}

	public void sort() {
		Collections.sort(this.list, new Comparator<Exercise9>() {

			@Override
			public int compare(Exercise9 std1, Exercise9 std2) {
				return (int) (std1.getAverage() - std1.getAverage());
			}
		});
	}

	public void MaxMath() {
		double max = 0;
		for (int i = 0; i < list.size(); i++) {
			Exercise9 std = list.get(i);
			if (std.getMath() > max) {
				max = std.getMath();
			}
		}
		for (int i = 0; i < list.size(); i++) {
			Exercise9 std = list.get(i);
			if (list.get(i).getMath() == max) {
				std.display();
			}
		}
	}

	public void Display23() {
		for (int i = 0; i < list.size(); i++) {
			Exercise9 std = list.get(i);
			if (std.getAge() > 23) {
				std.display();
			}
		}
	}

	public static void main(String[] args) {
		new Exercise9_main();
	}
}
