package homework3;

public class Exercise16 {
	public static void dayso(int n) {
		int sum =0;
		System.out.print(sum);
		for (int i=3; i<=n ; i=i+2) {
			sum = sum +i;
		System.out.print(" " + sum);
		}
	}
	public static void main(String[] args) {
		dayso(19);
	}
}
