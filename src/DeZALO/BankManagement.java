package DeZALO;

import java.util.ArrayList;
import java.util.Scanner;

public class BankManagement {
	ArrayList<Bank> listBank = new ArrayList<Bank>();
	Scanner sc = new Scanner(System.in);

	public BankManagement() {
		while (true) {
			System.out.println("1. Input Bank's information");
			System.out.println("2. Output Bank's information that the user is using");
			System.out.println("3. Display list of users following Bank");
			System.out.println("4. Sum of money that banks having");
			System.out.println("5. Nap tien");
			System.out.println("6. Chuyen tien");
			System.out.println("7. Rut tien");
			System.out.println("8. KT so du");
			System.out.println("9. Sort list of users following balance");
			System.out.println("Your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				this.InputBank();
				break;
			case 2:
				this.OutputBank();
				break;
			case 3:
				this.listUser();
				break;
			case 4:
				this.Sum();
				break;
//			case 5: 
//				this.napTien();
//				break;
//			case 6:
//				this.chuyenTien();
//				break;
//			case 7:
//				this.rutTien();
//				break;
			case 9:
				this.Sort();
				break;
			default:
				break;
					
			}
		}
	}

	public void InputBank() {
		System.out.println("Input the number of banks: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Bank b = new Bank();
			b.InputBank();
			listBank.add(b);
		}
	}

	public void OutputBank() {
		for (int i = 0; i < listBank.size(); i++) {
			Bank b = listBank.get(i);
			b.toString();
		}
	}

	public void listUser() {
		System.out.println("Input the Bank's name: ");
		String nameB = sc.next();
		for (int i = 0; i < listBank.size(); i++) {
			Bank b = listBank.get(i);
			if (b.getNameBank().equals(nameB)) {
				b.Users();
			}
		}
	}

	public void Sum() {
		for (int i = 0; i < listBank.size(); i++) {
			Bank b = listBank.get(i);
			System.out.println(b.getNameBank() + "has sum of money: " + b.SumMoney());
		}
	}

//	public void napTien() {
//
//	}
//
//	public void chuyenTien() {
//		System.out.println("Nhap so TK can chuyen tien: ");
//		String STK = sc.nextLine();
//		for (int i = 0; i < listBank.size(); i++) {
//			Bank b = listBank.get(i);
//
//		}
//	}
//	public void rutTien() {
//		
//	}
	public void Sort() {
		for (int i = 0; i < listBank.size(); i++) {
			Bank b = listBank.get(i);
			b.sortbalance();
		}
	}

	public static void main(String[] args) {
		new BankManagement();
	}
}