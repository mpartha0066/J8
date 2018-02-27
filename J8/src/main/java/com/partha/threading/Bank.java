package com.partha.threading;

import java.util.HashMap;

/*public class Bank {
	private static Bank instance = new Bank();
	private HashMap<Integer, BankAccount> accountNumberVsAccount;
	
	private Bank(){
		accountNumberVsAccount = new HashMap<>();
		accountNumberVsAccount.put(123456, new BankAccount(123456));
	}
	
	public static Bank getInstance(){
		return instance;
	}
	
	public BankAccount getAcccount(Integer accountNumber){
		return accountNumberVsAccount.get(accountNumber);
	}

}*/
public enum Bank{
	INSTANCE;
	
	private HashMap<Integer, BankAccount> accountNumberVsAccount;
	
	private Bank() {
		accountNumberVsAccount = new HashMap<>();
		accountNumberVsAccount.put(123456, new BankAccount(123456));
	}
	
	public BankAccount getAccount(Integer accountNumber){
		return accountNumberVsAccount.get(accountNumber);
	}
}