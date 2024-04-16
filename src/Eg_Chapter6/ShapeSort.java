package Eg_Chapter6;

import java.util.Arrays;

public class ShapeSort {
	public static void main(String[] args) {
		Shape vec[] = new Shape[10];
		for (int i = 0; i < vec.length; i++) {
			switch ((int) (4 * Math.random())) {
			case 1:
				vec[i] = new Rectangle(1000 * Math.random(), 1000 * Math.random());
				break;
			case 2:
				vec[i] = new Circle(1000 * Math.random());
				break;
			default:
				vec[i] = new EquilateralTriangle(1000 * Math.random());
			}
		}
		Arrays.sort(vec);
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
	}
}
