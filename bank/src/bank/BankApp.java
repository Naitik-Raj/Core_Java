package bank;

import bank.entities.Account;
import bank.interfaces.Bank;

public class BankApp {
	public static void main(String[] args) {
		Account accounts = new Account(1001, "abc", 100000);
		
		
		System.out.println(deposite.transaction(accounts, 1000));
		System.out.println(accounts);
		System.out.println(withdraw.transaction(accounts, 99500));
		System.out.println(accounts);
	}
}
