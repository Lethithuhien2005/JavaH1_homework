package homework7;

import java.util.Scanner;

public class TriangleEdgesCheck {
	public static void CheckEdges(float a, float b, float c) throws TriangleEdgesException {
		if (a + b <= c || a + c <= b || b + c <= a) {
			throw new TriangleEdgesException("Canh khong hop le");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap 3 canh cua tam giac");
			System.out.print("a = ");
			float a = sc.nextFloat();
			System.out.print("b = ");
			float b = sc.nextFloat();
			System.out.print("c = ");
			float c = sc.nextFloat();
			CheckEdges(a, b, c);
		} catch (TriangleEdgesException e) {
			System.out.println(e.getMessage());
		}
	}
}
