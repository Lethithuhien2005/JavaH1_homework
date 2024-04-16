package homework6_Ex4;

import java.util.Scanner;

public class Matrix {
	private final int SIZE = 50;
	private int rows;
	private int cols;
	private int A[][];

	public Matrix() {
		rows = 0;
		cols = 0;
		A = new int[rows][cols];
	}

	public Matrix(int rows, int cols) {
		if (rows >= SIZE || cols >= SIZE) {
			rows = 3;
			cols = 3;
			A = new int[rows][cols];
		} else {
			this.rows = rows;
			this.cols = cols;
			A = new int[rows][cols];
		}
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public void display() {
		Scanner sc = new Scanner(System.in);
		int A[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("A[" + i + "][" + j + "]=");
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Matrix has entered:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	public Matrix add(Matrix mtr2) {
		Matrix mtrSum = new Matrix(rows, cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mtrSum.A[i][j] = A[i][j] + mtr2.A[i][j];
			}
		}
		return mtrSum;

	}

	public Matrix sub(Matrix mtr2) {
		Matrix mtrSub = new Matrix(rows, cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mtrSub.A[i][j] = A[i][j] - mtr2.A[i][j];
			}
		}
		System.out.println(mtrSub);
		return mtrSub;

	}

	public Matrix prod(Matrix mtr2) {
		Matrix mtrProd = new Matrix(rows, mtr2.cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < mtr2.cols; j++) {
				mtrProd.A[i][j] = 0;
				for (int k = 0; k < cols; k++) {
					mtrProd.A[i][j] = A[i][j] * mtr2.A[i][j];
				}
			}
		}
		return mtrProd;
	}

	public void transpose() {
		for (int j = 0; j < cols; j++) {
			for (int i = 0; i < rows; i++) {
				System.out.print(A[j][i] + "\t");
			}
		}
	}

	public boolean isSquare() {
		if (rows == cols)
			return true;
		else
			return false;
	}

	public void rowSwap(int row1, int row2) {
		for (int i = 0; i < cols; i++) {
			int t = A[row1 - 1][i];
			A[row1 - 1][i] = A[row2 - 1][i];
			A[row2 - 1][i] = t;
		}
	}

	public void colSwap(int col1, int col2) {
		for (int i = 0; i < rows; i++) {
			int tg = A[i][col1 - 1];
			A[i][col1 - 1] = A[i][col2 - 1];
			A[i][col2 - 1] = tg;
		}
	}

	public int sumRow(int row) {
		int s = 0;

		for (int i = 0; i < cols; i++) {
			s += A[row - 1][i];
		}

		return s;
	}

	public int sumCol(int col) {
		int s = 0;

		for (int i = 0; i < rows; i++) {
			s += A[i][col - 1];
		}

		return s;
	}

	public int max() {
		int max = A[0][0];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (max < A[i][j]) {
					max = A[i][j];
				}
			}
		}

		return max;
	}

	public int min() {
		int min = A[0][0];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (min > A[i][j]) {
					min = A[i][j];
				}
			}
		}

		return min;
	}

	public int maxRow(int row) {
		int max = A[row - 1][0];

		for (int i = 1; i < cols; i++) {
			if (max < A[row - 1][i]) {
				max = A[row - 1][i];
			}
		}

		return max;
	}

	public int minRow(int row) {
		int min = A[row - 1][0];

		for (int i = 1; i < cols; i++) {
			if (min > A[row - 1][i]) {
				min = A[row - 1][i];
			}
		}

		return min;
	}

	public int maxCol(int col) {
		int max = A[0][col - 1];

		for (int i = 1; i < rows; i++) {
			if (max < A[i][col - 1]) {
				max = A[i][col - 1];
			}
		}

		return max;
	}

	public int minCol(int col) {
		int min = A[0][col - 1];

		for (int i = 0; i < rows; i++) {
			if (min > A[i][col - 1]) {
				min = A[i][col - 1];
			}
		}

		return min;
	}
}
