package week2_Assignment3;

import java.util.*;

class Bank {
	private String bankName;
	private ArrayList<Account> accounts;
	
	public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public Account openAccount(Customer customer, double initialDeposit) {
        Account newAccount = new Account(customer, this, initialDeposit);
        accounts.add(newAccount);
        customer.addAccount(newAccount);
        System.out.println("Account opened for " + customer.getName() + " at " + bankName);
        return newAccount;
    }

    public String getBankName() {
        return bankName;
    }
	
}

class Customer {
	String customerName;
	List<Account> accounts;
	
	public Customer(String customerName) {
        this.customerName = customerName;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalances() {
        System.out.println(customerName + "'s Accounts:");
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getBankName() + " | Balance: $" + account.getBalance());
        }
    }

    public String getName() {
        return customerName;
    }
}


class Account {
	private Customer customer;
	private Bank bank;
	private double balance;
	
	public Account(Customer customer, Bank bank, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
	
}

public class BankAndAccountHolders {

	public static void main(String[] args) {
		
		// Creating Bank objects
        Bank hdfc = new Bank("HDFC Bank");
        Bank sbi = new Bank("SBI Bank");

        
        // Creating Customer objects
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        
        // Opening accounts
        hdfc.openAccount(alice, 5000);
        sbi.openAccount(alice, 3000);
        hdfc.openAccount(bob, 7000);

        
        // Viewing balances
        alice.viewBalances();
        System.out.println();
        bob.viewBalances();
		
	}

}
