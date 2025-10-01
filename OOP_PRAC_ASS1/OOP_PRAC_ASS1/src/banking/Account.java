package banking;
import java.io.FileWriter;
import java.io.IOException;

public class Account extends Bank {

	public Account(String accountName, double balance) {
		super(accountName, balance);
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			recordTransaction("Deposited: " + amount);
		}
		else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			recordTransaction("Withdrew: " + amount);
		}
		else {
			System.out.println("Withdrawal amount exceeded account balance");
		}
	}
	
	public double getBalance() {
		recordTransaction("Checked balance: " + balance);
		return balance;
	}
	
	private void recordTransaction(String message) {
		try (FileWriter writer = new FileWriter("Bank.txt", true)) {
			writer.write(accountName + "-" + message + "\n");
		}
		catch (IOException e) {
			System.out.println("Error writing transaction: " + e.getMessage());
		}
	}
}
