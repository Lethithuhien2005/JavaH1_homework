package homework3;

public class Exercise10 {
	public static int Sum(int x, int y) {
		int sum = 0;
		for (int i=x; i<=y; i++) {
			if (i%7==0) {
				sum = sum+i;
			}
		}
		System.out.println("Sum of all number that divides 7 without a residual: " +sum);
		return sum;
	}
	public static void main(String[] args) {
		Sum(1,100);
	}

}
