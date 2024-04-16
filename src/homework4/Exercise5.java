package homework4;

public class Exercise5 {
	public static void main(String[] args) {
		int factor = 1;
		int i;
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (i = 0; i < arr.length; i++) {
			factor = factor * (i + 1);
				System.out.println(factor + "=" + arr[i] + "!");

		}
	}
}