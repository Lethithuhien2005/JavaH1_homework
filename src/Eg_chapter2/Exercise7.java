package Eg_chapter2;

public class Exercise7 {
	public static void main(String[] args) {
		Cube cube1, cube2;
		cube1 = new Cube(4);
		cube2 = new Cube(3);

		System.out.println("cube1's size=" + cube1.getSize());
		System.out.println("cube2's size=" + cube2.getSize());

		cube1.setSize(10);
		cube2.setSize(20);

		cube1.details();
		cube2.details();

	}
}
