package onClass;

import java.util.Scanner;
import java.util.Vector;

public class StudentManagement1 {
	
	// dung de chua danh sach sinh vien
Vector list= new Vector();

public StudentManagement1() {
	while(true) {
		// hien thi menu chuong trinh 
		System.out.println("*-CHUONG TRINH QUAN LY SINH VIEN-*");
		System.out.println("*-CHUC nang chinh chuong trinh-*");
		System.out.println("  1. Nhap danh sach sinh vien   ");
		System.out.println("  2. Xem danh sach sinh vien  ");
		System.out.println("  3. Sap xep danh sach sinh vien tang dan diem trung binh   ");
		System.out.println("  4. Tim sinh vien theo ten   ");
		System.out.println("  5. Thoat   ");
		System.out.println("  ----------------");
		
		// nhap mot so tu ban phim
		int num;
		Scanner key = new Scanner(System.in);
		System.out.println("  Nhap mot so de chon chuc nang: ");
		num = key.nextInt();
		
		// kiem tra va goi chuc nang tuong ung 
		switch(num) {
		case 1:
			this.input();
			break;
		case 2:
			this.view();
			break;
		case 3:
			sort();
			break;
		case 4:
			search();
			break;
		case 5:
			sys
		}
	}
}
}
