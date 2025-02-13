package week2_Assignment2;


class Bank {
	public long accountNumber;
	protected String accountHolder;
	private double balance;
	
	
	Bank(long accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void display() {
		System.out.println("Bank Account Details : ");
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder : "+accountHolder);
		System.out.println("Current balance : ₹"+balance);
	}
}


class SavingAccount extends Bank {
	
	SavingAccount(long accountNumber, String accountHolder, double balance){
		super(accountNumber, accountHolder, balance);
	}
	
	public void display() {
		System.out.println("Saving Account Details : ");
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder : "+accountHolder);
	}
}



public class Bank_Account_Management {

	public static void main(String[] args) {
		
		// bank account object
		Bank b = new Bank(1234567890,"Sam",40000);
		b.display();
		
		System.out.println();
		
		b.setBalance(100000);
		
		b.display();
		
		
		System.out.println();
		
		
		// Saving account object
		SavingAccount sa = new SavingAccount(839475234,"Ronny",60000);
		sa.display();
		
		System.out.println();
		
		sa.setBalance(70000);
		
		sa.display();
	}

}
