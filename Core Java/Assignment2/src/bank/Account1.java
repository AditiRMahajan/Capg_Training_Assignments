package bank;

public class Account1 {
	private long accNo;
	 double balance;
	private String accHolder;

	public Account1() {
	}

	public Account1(long accNo, double balance, String accHolder) {
		this.accNo = accNo;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public void deposit(double amt) {
		balance = balance + amt;
	}

	public void withdraw(double amt) {
		balance = balance + amt;

	}

	public double getBalance() {
		return balance;
	}

	public void showAccount1() {
		System.out.println("Account Number:" + accNo);
		System.out.println("Holder name:" + accHolder);
		System.out.println("balance:" + balance);
	}

}
