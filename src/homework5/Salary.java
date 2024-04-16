package homework5;

import java.lang.String;

public class Salary {
	private double sum;
	private int month;
	private double tax;

	public Salary(double sum, int month, double tax) {
		this.sum = sum;
		this.month = month;
		this.tax = tax;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Salary: sum=" + sum + ", month=" + month + ", tax=" + tax;
	}
}
