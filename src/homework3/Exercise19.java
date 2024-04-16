package homework3;

public class Exercise19 {
	public static void main(String[] args) {
		int i = 0;
		int sum;
		do {
			sum = (int) Math.pow(3, i);
			System.out.print(sum + "  ");
			i++;
		} while (i<10);
	}
}
