package onClass;

import java.util.ArrayList;
import java.util.Scanner;

public class TransportMangement {
	Scanner sc = new Scanner(System.in);
	ArrayList<Oto> list1 = new ArrayList<Oto>();
	ArrayList<XeMay> list2 = new ArrayList<XeMay>();

	public TransportMangement() {
		while (true) {
		System.out.println(" 1. Nhap danh sach o to");
		System.out.println(" 2. Nhap danh sach xe may");
		System.out.println(" 3. Hien thi thong tin");
		System.out.println(" 4. Xoa phuong tien theo ID");
		System.out.println(" 5. Tim phuong tien theo hang san xuat");
		System.out.println(" 6. Thoat");
		System.out.print("Nhap lua cho cua ban: ");
		int choose = sc.nextInt();
			switch (choose) {
			case 1:
				this.InputCar();
				break;
			case 2:
				this.InputMoto();
				break;
			case 3:
				this.Ouput();
				break;
			case 4:
				this.deleteID();
				break;
			case 5:
				this.Search();
				break;
			default:
				break;
			}
		}

	}

	public void InputCar() {
		System.out.println("Input the number of car: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Oto oto = new Oto();
			oto.Input();
			list1.add(oto);
		}
	}

	public void InputMoto() {
		System.out.println("Input the number of motobike: ");
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			XeMay xm = new XeMay();
			xm.Input();
			list2.add(xm);
		}
	}

	public void Ouput() {
		for (int i = 0; i < list1.size(); i++) {
			Oto oto = list1.get(i);
			oto.display();
		}
		for (int i=0; i<list2.size(); i++) {
			XeMay xm = list2.get(i);
			xm.display();
		}
	}
//		public void addID() {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Nhap ID de them phuong tien");
//			String id = sc.nextLine();
//			for (int i=0; i<list1.size(); i++) {
//				Oto oto = new Oto(id, id, i, i)
//				list1.add()
//			}
//		}

	public void deleteID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ID de xoa phuong tien");
		String id = sc.nextLine();
		for (int i = 0; i < list1.size(); i++) {
			Oto oto = list1.get(i);
			if (oto.getID().equals(id)) {
				list1.remove(i);
			}
		}
		for (int i = 0; i < list2.size(); i++) {
			XeMay xm = list2.get(i);
			if (xm.getID().equals(id)) {
				list2.remove(i);
			}
		}
	}

	public void Search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten hang san xuat de tim phuong tien ");
		String hsx = sc.nextLine();
		for (int i = 0; i < list1.size(); i++) {
			Oto oto = list1.get(i);
			if (oto.getHangSX().equals(hsx)) {
				oto.display();
			}
		}
		for (int i = 0; i < list2.size(); i++) {
			XeMay xm = list2.get(i);
			if (xm.getHangSX().equals(hsx)) {
				xm.display();
			}
		}
	}

	public static void main(String[] args) {
		TransportMangement trp = new TransportMangement();
	}
}
