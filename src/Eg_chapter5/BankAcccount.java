package Eg_chapter5;

public class BankAcccount {
		public static void main(String[] args) {
			Account acc1 = new Account(100, 123123);
			System.out.println("\ncreate new account");
			acc1.details();
			System.out.println("\ndeposit 2000");
			acc1.deposit(2000);
			acc1.details();
			System.out.println("\nwithdrawing 1000");
			acc1.withdraw(1000);
			acc1.details();
		}
	}
