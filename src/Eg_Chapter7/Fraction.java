package Eg_Chapter7;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int num1, int num2) throws FractionException {
		if (num2 == 0) {
			throw new FractionException("Loi do mau so = 0");
		}
		numerator = num1;
		denominator = num2;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	public static Fraction Divide(Fraction fract1, Fraction fract2) throws FractionException {
		if (fract2.numerator == 0) {
			throw new FractionException("Loi do chia cho 0");
		}
		return new Fraction(fract1.numerator * fract2.denominator, fract1.denominator * fract2.numerator);
	}

	public static void main(String[] args) {
		Fraction fr1, fr2, fr3;
		try {
			fr1 = new Fraction(1, 2);
			fr2 = new Fraction(0, 1);
			Fraction temp = Divide(fr1, fr2);
			System.out.println(temp);
		} catch (FractionException e) {
			System.out.println(e.getMessage());
		}
	}
}
