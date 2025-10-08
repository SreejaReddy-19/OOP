package abstract_class;

abstract class BankAccount {
    String accountNumber;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    double interestRate = 0.04; // 4%

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

class CurrentAccount extends BankAccount {
    @Override
    public double calculateInterest() {
        return 0; // No interest for current account
    }
}
public class Bank{
	public static void main(String args[] ){
		BankAccount account = new SavingsAccount();
        account.accountNumber = "SB1001";
        account.deposit(10000);
        account.withdraw(2500);
        System.out.println("Interest: ₹" + account.calculateInterest());

	}
}
