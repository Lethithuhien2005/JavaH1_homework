package Eg_chapter5;

public class Account {
	private double balance;
	private long id;

	public Account(double balanceVal, long idVal) {
		balance = balanceVal;
		id = idVal;
	}

	public void withdraw(double sum) {
		balance -= sum;
	}

	public void deposit(double sum) {
		balance += sum;
	}

	public void details() {
		System.out.println("\nid=" + id);
		System.out.println("balance=" + balance);
	}
}
