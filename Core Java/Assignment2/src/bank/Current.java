package bank;

public class Current extends Account1 {
	private final double overdraft = 10000;

	public Current(long accNo, String accHolder, double balance) {
		super(accNo, balance, accHolder);
		// this.overdraft = overdraft;

	}

	@Override
	public void withdraw(double amt) {
		if (amt > overdraft) {
			System.out.println("limit is reached");
			System.out.println("Current Overdraft is:" + amt);

		}

	}

	public void getName() {
	}

}
