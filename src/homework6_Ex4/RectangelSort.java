package homework6_Ex4;

import java.util.Arrays;

public class RectangelSort {
	public static void main(String[] args) {
		Rectangle_EX4_ex6 vec[] = new Rectangle_EX4_ex6[10];

		double randomwidth = 0;
		double randomheight = 0;
		for (int i=0; i<vec.length; i++) {
			randomwidth = 100*Math.random();
			randomheight = 100*Math.random();
			vec[i] = new Rectangle_EX4_ex6(randomwidth, randomheight);
		}
		Arrays.sort(vec);
		for (int i=0; i<vec.length; i++) {
			System.out.println("Dien tich HCN" + i + "= " + Math.round(vec[i].area()) + ", ");
		}
	}
}
