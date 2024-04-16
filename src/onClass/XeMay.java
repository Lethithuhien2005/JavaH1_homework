package onClass;

import java.util.Scanner;

public class XeMay extends Transport {
	private double congsuat;

	public XeMay() {
	}

	public XeMay(String iD, String hangSX, long giaban, double congsuat) {
		super(iD, hangSX, giaban);
		this.congsuat = congsuat;
	}

	public double getCongsuat() {
		return congsuat;
	}

	public void setCongsuat(double congsuat) {
		this.congsuat = congsuat;
	}

	@Override
	public void Input() {
		super.Input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Cong suat: ");
		this.setCongsuat(sc.nextDouble());
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Cong suat: " + this.getCongsuat());
	}

}
