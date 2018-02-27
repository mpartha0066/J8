package com.partha.threading;

public class BankAccount {
	private Integer balance;
	private Integer accountNumebr;
	public BankAccount(Integer balance, Integer accountNumebr) {
		this.balance = balance;
		this.accountNumebr = accountNumebr;
	}
	public BankAccount(Integer accountNumebr) {
		this(0,accountNumebr);
	}
	public Integer getBalance() {
		return balance;
	}
	public Integer getAccountNumebr() {
		return accountNumebr;
	}
	
	public void deposit(Integer amount){
		balance += amount;
		System.out.println(Thread.currentThread().getName() + 
				" depositing the amount "+amount+" updated balance =  " + balance);
	}
	
	public Integer withdraw(Integer amount){
		System.out.println(Thread.currentThread().getName()
				+ " trying with withdraw amount "+amount+" from account number "+accountNumebr);
		if(balance < amount){
			System.out.println("OOPS, NO BALANCE LEFT TO WITHDRAW FOR "+Thread.currentThread().getName());
			return 0;
		}
		balance -= amount;
		System.out.println(Thread.currentThread().getName() +" successfully withdrow the amount. balance left =  " + balance);
		return amount;
	}
	
	
	
}
