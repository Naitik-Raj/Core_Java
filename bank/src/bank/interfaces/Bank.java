package bank.interfaces;

import bank.entities.Account;

@FunctionalInterface
public interface Bank {
	float MIN_BALANCE = 1000;
	float DEPOSIT_LIMIT = 200000;
	String transaction(Account account, float amount);
}
