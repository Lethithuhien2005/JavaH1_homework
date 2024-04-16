package homework6_Ex4;

public class TestShape_EX4 {
	public static void main(String[] args) {
		Shape_EX4 vec[] = { new Circle_EX4(3), new Rectangle_EX4(4, 5), new Circle_EX4(4), new Circle_EX4(8) };
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
	}
}
