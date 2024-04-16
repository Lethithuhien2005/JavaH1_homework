package homework3;

public class Exercise17 {
	public static void dayso(int n) {
		int sum=1;
		System.out.print(sum);
		for ( int i=2; i<=n; i=i*2){
			sum=sum+i;
			System.out.print(" " + sum);
		}
	}

	public static void main(String[] args) {
		dayso(1020);
	}
}
