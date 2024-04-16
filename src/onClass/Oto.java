package onClass;

import java.util.Scanner;

public class Oto extends Transport {
	private int soChoNgoi;
	
	public Oto () {
		
	}

	public Oto(String iD, String hangSX, long giaban, int soChoNgoi) {
		super(iD, hangSX, giaban);
		this.soChoNgoi = soChoNgoi;
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	@Override
	public void Input() {
		super.Input();
		Scanner sc = new Scanner(System.in);
		System.out.println("So cho ngoi: ");
		this.setSoChoNgoi(sc.nextInt());
	}

	@Override
	public void display() {
		super.display();
		System.out.println("So cho ngoi: " + this.getSoChoNgoi());
	}
}
