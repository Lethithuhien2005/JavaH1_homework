package homework3;

public class Exercise8 {
	public static double Average(int x, int y) {
		double avr;
		double sum = 0;
		for (int i = x; i <= y; i++) {
			sum = sum + i;
		}
		avr = sum / y;
		return avr;
	}

	public static void main(String[] args) {
		System.out.println("Average = " + Average(1, 100));
	}
}
