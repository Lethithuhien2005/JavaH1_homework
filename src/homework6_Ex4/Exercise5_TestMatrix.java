package homework6_Ex4;

import java.util.Scanner;

public class Exercise5_TestMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Matrix mtr1 = new Matrix(3, 3);
		Matrix mtr2 = new Matrix(3, 3);
		System.out.println("Input Matrix 1:");
		mtr1.display();
		System.out.println();
		System.out.println("Input Matrix 2:");
		mtr2.display();
		Matrix mtrSum;
		Matrix mtrSub;
		Matrix mtrProd;
		mtrSum = mtr1.add(mtr2);
		mtrSub = mtr1.sub(mtr2);
		mtrProd = mtr1.prod(mtr2);
		mtrSum.display();
		mtrSub.display();
		mtrProd.display();
		System.out.println("Transpose the matrix 1: ");
		mtr1.transpose();
		System.out.println("Transpose the matrix 2: ");
		mtr2.transpose();
		System.out.println("Matrix 1 is square: " + mtr1.isSquare());
		System.out.println("Matrix 2 is square: " + mtr2.isSquare());
		int row1, row2;
		do {
			System.out.println("Input 2 row numbers of matrix 2 to swap: ");
			row1 = sc.nextInt();
			row2 = sc.nextInt();
			if (row1 > mtr2.getRows() || row2 > mtr2.getRows()) {
				System.out.println("Please reipnut the row number");
			}
		} while (row1 > mtr2.getRows() || row2 > mtr2.getRows());
		mtr2.rowSwap(row1, row2);
		System.out.println("Matrix 2 after swapping row : ");
		mtr2.display();
		int col1, col2;
		do {
			System.out.println("Input 2 columns numbers of matrix 2 to swap: ");
			col1 = sc.nextInt();
			col2 = sc.nextInt();
			if (col1 > mtr1.getRows() || col2 > mtr1.getRows()) {
				System.out.println("Please reipnut the row number");
			}
		} while (col1 > mtr1.getRows() || col2 > mtr1.getRows());
		mtr1.colSwap(col1, col2);
		System.out.println("Matrix 1 after swapping column : ");
		mtr1.display();
		System.out.println("Sum of 2 matrix : " + mtrSum);
		System.out.println("Sub of 2 matrix : " + mtrSub);
		System.out.println("Product of 2 matrix : " + mtrProd);
		System.out.println("Sum all elements in a row of matrix 1 = " + mtr1.sumRow(2));
		System.out.println("Sum all elements in a column of matrix 2 = " + mtr2.sumCol(1));
		System.out.println("Max value of matrix 1 is: " + mtr1.max());
		System.out.println("Min value of matrix 2 is: " + mtr2.min());
		System.out.println("Max value of the first row in matrix 1 is: " + mtr1.maxRow(0));
		System.out.println("Min value of the first row in matrix 1 is: " + mtr1.minRow(0));
		System.out.println("Max value of the first column in matrix 2 is: " + mtr2.maxRow(0));
		System.out.println("Min value of the first column in matrix 2 is: " + mtr2.minRow(0));
	}
}
