package bank;

public class Saving extends Account1{
	private final double minBal = 500;

	public Saving(long accNo, String accHolder, double balance) {
		super(accNo, balance, accHolder);
//		this.minBal = minBal;

	}

	@Override
	public void withdraw(double amt) {
		if (amt < minBal) {
			System.out.println("no withdraw will happen");
		}
	}

	public double getMinBal() {
		return minBal;
	}

	public double getBalance() {
		super.getBalance();
		return balance;

	}

	@Override
	public void showAccount1() {
		super.showAccount1();
	}

}
