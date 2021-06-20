package Entities;

public class Bank {
	private int accountNumber;
	public String holder;
	private double balance;
	
	public Bank(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Bank(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		withdraw += 5.00;
		this.balance -= withdraw;
	}

	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
}
