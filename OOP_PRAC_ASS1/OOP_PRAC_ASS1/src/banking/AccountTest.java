package banking;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account("John Doe", 1000);
		
		acc.deposit(500);
		acc.withdraw(200);
		acc.withdraw(2000);
		System.out.println("Final Balance: " + acc.getBalance());
	}

}
