package DeZALO;

import java.util.Calendar;
import java.util.Scanner;

public class Nguoi implements Method {
	private String id;
	private String ten;
	private int namSinh;
	private Bank idBank;
	private String soTK;
	private long soduTK;
	private String diachi;
	private boolean KHTT;

	public Nguoi() {

	}

	public String getId() {
		return id;
	}

	public Nguoi(String id, String ten, int namSinh, Bank idBank, String soTK, long soduTK, String diachi,
			boolean kHTT) {
		this.id = id;
		this.ten = ten;
		this.namSinh = namSinh;
		this.idBank = idBank;
		this.soTK = soTK;
		this.soduTK = soduTK;
		this.diachi = diachi;
		KHTT = kHTT;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public Bank getIdBank() {
		return idBank;
	}

	public void setIdBank(Bank idBank) {
		this.idBank = idBank;
	}

	public String getSoTK() {
		return soTK;
	}

	public void setSoTK(String soTK) {
		this.soTK = soTK;
	}

	public long getSoduTK() {
		return soduTK;
	}

	public void setSoduTK(long soduTK) {
		this.soduTK = soduTK;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public boolean isKHTT() {
		if (this.getSoduTK() > 10000000) {
			return true;
		} else
			return false;
	}

	public void setKHTT(boolean kHTT) {
		KHTT = kHTT;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID: ");
		setId(sc.nextLine());
		System.out.println("Name user: ");
		setTen(sc.nextLine());
		System.out.println("Nam sinh: ");
		setNamSinh(sc.nextInt());
		System.out.println("So TK: ");
		setSoTK(sc.nextLine());
		sc.nextLine();
		System.out.println("So du TK: ");
		setSoduTK(sc.nextLong());
		System.out.println("Dia chi: ");
		setDiachi(sc.nextLine());
		sc.nextLine();
		System.out.println("Khach hang than thiet: " + this.isKHTT());
	}

//	@Override
//	public String toString() {
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get(Calendar.YEAR);
//		return "Nguoi id=" + id + ", ten=" + ten + ", tuoi=" + (year - namSinh) + ", soTK="
//				+ soTK + ", soduTK=" + soduTK + ", diachi=" + diachi + ", KHTT=" + KHTT;
//	}
	public void display() {
		System.out.println(this.getId() + " " + this.getTen() + " " + this.getNamSinh() + " " + this.getSoTK() + " " + this.getSoduTK() + this.getDiachi());
	}

	@Override
	public void naptien() {
		Scanner sc = new Scanner(System.in);
		System.out.println("So tien can nap: ");
		long napTien = sc.nextLong();
		this.soduTK = this.getSoduTK() + napTien;
	}

	@Override
	public void chuyentien() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tien can chuyen: ");
		long chuyen = sc.nextLong();
		if (this.isKHTT() == true) {
			this.soduTK = this.getSoduTK() - chuyen;
		} else
			this.soduTK = this.getSoduTK() - chuyen - 2000;

	}

	@Override
	public void rutTien() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tien can rut: ");
		long rut = sc.nextLong();
		while (rut < 50000) {
			System.out.println("So tien rut chua dat muc toi thieu");
		}
		if (this.isKHTT() == true) {
			this.soduTK = this.getSoduTK() - rut;
		} else
			this.soduTK = this.getSoduTK() - rut - 2000;

	}

	@Override
	public void KTsoDu() {
		System.out.println("So du TK hien tai: " + this.getSoduTK());
	}

}
