package Eg_chapter5;

public class LineTest {
	public static void main(String[] args) {
		Line2D line1 = new Line2D(new Point_2D(10, 20), new Point_2D(5, 15));
		Line2D line2 = new Line2D(new Point_2D(4, 4), new Point_2D(33, 22));
		System.out.println("The length of line1 is: " + line1.length());
		System.out.println("The length of line2 is: " + line2.length());
		if (line1.isParallel(line2)) {
			System.out.println("line1 is parallel to line2");
		} else {
			System.out.println("line1 is not parallel to line2");
		}
	}
}
