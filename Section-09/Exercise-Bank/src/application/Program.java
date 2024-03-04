package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		Scanner scStr = new Scanner( System.in );
		Locale.setDefault(Locale.US);
		Account account;
		
		System.out.print("\n Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print(" Enter account holder: ");
		String accountHolder = scStr.nextLine();
		
		System.out.print(" Is there an initial deposit? (y/n): ");
		if(((scStr.next().charAt(0)) == 'y')) {
			
			System.out.print(" Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			account = new Account( accountNumber , accountHolder , initialDeposit );
			
		}else {
			
			account = new Account( accountNumber , accountHolder );
		}
		
		System.out.print("\n Account data: \n " + account);
		
		System.out.print("\n\n Enter a deposit value: ");
		account.balanceDeposit(sc.nextDouble());
		
		System.out.print("\n Updated account data: \n " + account);
		
		System.out.print("\n\n Enter a withdraw value: ");
		account.balanceWithdraw(sc.nextDouble());
		
		System.out.print("\n Updated account data: \n " + account);
	}

}
