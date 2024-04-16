package homework3;

public class Exercise11 {
	public static void Result(int x, int y) {
		String out = "";
		for (int i = x; i <= y; i++) {
			System.out.println(i);
			if (i % 2 == 0) {
				System.out.println("EVEN");
			} else {
				System.out.println("NOT EVEN");
			}
		}
	}

	public static void main(String[] args) {
		Result(1, 1000);
	}
}
