package onClass;

import java.util.Scanner;

public abstract class Transport {
	private String ID;
	private String HangSX;
	private long giaban;
	
	public Transport() {
		
	}

	public Transport(String iD, String hangSX, long giaban) {
		ID = iD;
		HangSX = hangSX;
		this.giaban = giaban;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getHangSX() {
		return HangSX;
	}

	public void setHangSX(String hangSX) {
		HangSX = hangSX;
	}

	public long getGiaban() {
		return giaban;
	}

	public void setGiaban(long giaban) {
		this.giaban = giaban;
	}
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID: ");
		this.setID(sc.next());
		System.out.println("Hang san xuat: ");
		this.setHangSX(sc.next());
		sc.nextLine();
		System.out.println("Gia ban: ");
		this.setGiaban(sc.nextLong());
	}
	public void display() {
		System.out.print("ID: " + this.getID() + "\t" + "Hang san xuat: " + this.getHangSX() + "\t" + "gia ban: " + this.getGiaban() + "\t");
	}
}
