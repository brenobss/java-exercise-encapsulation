package Main;

import java.util.Locale;
import java.util.Scanner;

import Entities.Bank;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank accountBank;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char haveInitialDeposit = sc.next().charAt(0);
		
		if(haveInitialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			accountBank = new Bank(accountNumber, accountHolder, initialDeposit);
		} else {
			accountBank = new Bank(accountNumber, accountHolder);
		}
		
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.printf("Account " + accountBank.getAccountNumber() + ", Holder: " + accountBank.holder + ", Balance $ %.2f", accountBank.getBalance());
		
		System.out.printf("%n%n");
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		accountBank.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.printf("Account " + accountBank.getAccountNumber() + ", Holder: " + accountBank.holder + ", Balance $ %.2f", accountBank.getBalance());
		
		System.out.printf("%n%n");
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		accountBank.withdraw(withdraw);
		System.out.println("Update account data: ");
		System.out.printf("Account " + accountBank.getAccountNumber() + ", Holder: " + accountBank.holder + ", Balance $ %.2f", accountBank.getBalance());
		
		sc.close();
		
	}

}
