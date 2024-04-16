package homework1_2;

import java.util.Random;

public class chapter2_Ex3 {
	public static void main(String[] args) {
		Random generator1 = new Random();
		// nextInt() method
		System.out.println("Random Integer from 0 to 9: " + generator1.nextInt(10));
		int value = generator1.nextInt(4) + 1;
		System.out.println("chooose random 1 in 4: " + value);
		// nextFloat() method
		Random generator2 = new Random();
		System.out.println("generator2: " + generator2);
		// nextDouble() method
		System.out.println("Random double: " + generator1.nextDouble());
		// nextBoolean() method
		System.out.println("Random boolean: " + generator1.nextBoolean());
		// ints(int, int) method
		System.out.println(generator2.ints(2, 5));
		// nextGaussian() method
		Random generator3 = new Random();
		System.out.println(generator3.nextGaussian());
		// doubles() method
		System.out.println(generator1.doubles());
		// doubles(double, double) method
		System.out.println(generator2.nextDouble(2,3));
		// longs() method
		Random generator4 = new Random();
		System.out.println("generator4: " + generator4.longs());
		// longs(long, long, long) method
		System.out.println(generator4.longs(2, 3, 5));
	}
}
