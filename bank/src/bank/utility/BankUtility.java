package bank.utility;

import bank.entities.Account;
import bank.entities.Valid;
import bank.interfaces.Bank;

public class BankUtility {
	public String deposite(Account accounts) {
		if(accounts instanceof Valid) {
			Bank deposite = (Account accounts, float amount) -> {
				if(amount <= Bank.DEPOSIT_LIMIT) {
					accounts.setBalance(accounts.getBalance() + amount);
					return "Deposit Successful...";
				}else {
					return "Transaction Rejected...";
				}
			};
		}else {
			return "invalid";
		}
	}
	
	public String withdraw(Account accounts) {
		if(accounts instanceof Valid) {
			Bank withdraw = (account, amount) -> {
				if(Bank.MIN_BALANCE < account.getBalance()-amount) {
					account.setBalance(account.getBalance() - amount);
					return "Withdrawl Successful...";
				}else {
					return "Transaction Rejected...";
				}
			};
		}else {
			return "invalid";
		}
	}
}
