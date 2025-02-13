package week2_Assignment1;
class BankAccount {
	String accountHolder;
	int accountNumber;
	int balance;
	
	// Deposit money
	public void depositMoney(int amount) {
		if(amount > 0 ) {
			balance += amount;
			System.out.println("Amount deposited successfully...");
		}else {
			System.out.println("NA");
		}
	}
	
	
	// Withdraw Money
	public void withDrawMoney(int amount) {
		if(amount > 0 && amount <= balance) {
			System.out.println("Amount WithDrawl succesfully!!!");
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	
	// Display balance
	public void displayCurrentBalance() {
		System.out.println("Current Balance : "+balance);
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		
		account.depositMoney(50000);
		account.withDrawMoney(10000);
		account.displayCurrentBalance();

	}

}
