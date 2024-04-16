package DeZALO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bank {
	private String idBank;
	private String nameBank;
	ArrayList<Nguoi> list = new ArrayList<Nguoi>();

	public Bank() {

	}

	public Bank(String idBank, String nameBank, ArrayList<Nguoi> list) {
		this.idBank = idBank;
		this.nameBank = nameBank;
		this.list = list;
	}

	public String getIdBank() {
		return idBank;
	}

	public void setIdBank(String idBank) {
		this.idBank = idBank;
	}

	public String getNameBank() {
		return nameBank;
	}

	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}

	public ArrayList<Nguoi> getList() {
		return list;
	}

	public void setList(ArrayList<Nguoi> list) {
		this.list = list;
	}

	public void InputBank() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID Bank: ");
		setIdBank(sc.nextLine());
		System.out.println("Bank's name: ");
		setNameBank(sc.nextLine());
		System.out.println("Input the number of user: ");
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			Nguoi n = new Nguoi();
			n.Input();
			list.add(n);
		}
	}

	public long SumMoney() {
		long sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Nguoi n = list.get(i);
			sum = sum + n.getSoduTK();
		}
		return sum;
	}
	public void Users() {
		for (int i = 0; i < list.size(); i++) {
			Nguoi n = list.get(i);
			n.display();
		}
	}

	@Override
	public String toString() {
		return "idBank: " + idBank + ", list: " + list + ", nameBank: " + nameBank + ", tong tien:  " + SumMoney();
	}

	public void sortbalance() {
		Collections.sort(this.list, new Comparator<Nguoi>() {

			@Override
			public int compare(Nguoi n1, Nguoi n2) {
				return (int) (n1.getSoduTK() - n2.getSoduTK());
			}
		});
	}
}
