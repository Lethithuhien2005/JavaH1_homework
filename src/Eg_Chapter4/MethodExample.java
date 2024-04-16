package Eg_Chapter4;

public class MethodExample {

	// two parts: data==attributes(variables), code==methods
	/*
	 * S= 1+2+3+....+n input: n (integer) output: S (sum (integer) of 1->n)
	 * 
	 * access_specifier(public,private,..) datatype(int, float,..)
	 * methodName(parameters(inputs)) { ....process parameters to get result return
	 * result; }
	 */
	public long Sum(int n) {
		long S = 0;
		for (int i = 1; i <= n; i++)
			S += i;
		return S;
	}

	/*
	 * write a method to calculate the following: S= x^1 + x^2 +....+x^n input? x
	 * (double) and n (int) output? S (double): sum of x^1 + x^2 +....+x^n
	 * 
	 */
	public double Sumpow(double x, int n) {
		double s = 0;
		double pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * x;
			s = s + pow;
		}
		return s;
	}

	public static void main(String[] args) {

		MethodExample O = new MethodExample();// create object
		double S = O.Sumpow(1, 5);
		System.out.println("Sum of 1^1+1^2+...1^5 = " + S);

	}

}
