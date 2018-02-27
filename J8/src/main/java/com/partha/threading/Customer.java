package com.partha.threading;

public class Customer implements Runnable{
	private int deposit;
	private int withdraw;
	@Override
	public void run() {
		BankAccount account = Bank.INSTANCE.getAccount(123456);
		synchronized (account) {
			account.deposit(deposit);
			account.withdraw(withdraw);	
		}
		
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	

}
