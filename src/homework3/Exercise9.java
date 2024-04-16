package homework3;

public class Exercise9 {
	public static int Biggest(int x, int y) {
		int max = -1;
		for (int i = x; i <= y; i++) {
			if (i % 7 == 0) {
				max = i;
			}
		}
		System.out.println("the biggest number between 1 to 100 that divides 7 without a redial= " + max);
		return max;
	}

	public static void main(String[] args) {
		Biggest(1, 100);
	}
}
