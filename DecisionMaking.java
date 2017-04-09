
public class DecisionMaking {

	public static void main(String s[]) {

		// BankAtm b1 = new BankAtm(10000);
		BankAtm b2 = new BankAtm(20000);
		try {
			// b1.withdraw(3000);
			b2.deposit(4000);
			b2.withdraw(5000);
			b2.withdraw(10000);
			b2.withdraw(3000);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

class bankATMException extends Exception {
	bankATMException(String s) {
		super(s);
	}
}

// bankATM class
class BankAtm

{
	String atmId, bankName, location;
	double balance;

	// parameterized constructor
	BankAtm(double val) {
		balance = val;
	}

	/*
	 * withdraw method which will allow withdrawal only if amount <= balance
	 * also if balance < 10000 withdrawal is not allowed withdrawal method
	 * throws exception
	 */
	void withdraw(double amt) throws bankATMException {

		System.out.println("Balance before withdrawal --->" + balance);
		if (balance <= 10000 || amt > balance) {

			System.out.println("throwing exception");
			amt = 0;
			throw new bankATMException("Cannot withdraw the amount");
		} else {
			balance = balance - amt;
		}

		System.out.println("Balance after withdrawal --->" + balance);
		System.out.println("amount withdrawn --->" + amt);

	}

	// deposit method to deposit amount
	void deposit(double amt) {
		System.out.println("Balance before deposit --->" + balance);
		balance = balance + amt;
		System.out.println("Balance after deposit --->" + balance);
	}
}
