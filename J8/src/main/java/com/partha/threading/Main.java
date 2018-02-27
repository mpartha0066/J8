package com.partha.threading;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		
		c1.setDeposit(100);
		c1.setWithdraw(50);
		
		c2.setWithdraw(25);
		c3.setDeposit(150);
		c4.setWithdraw(100);
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		Thread t4 = new Thread(c4);
		t1.setName("Customer 1");
		t2.setName("Customer 2");
		t3.setName("Customer 3");
		t4.setName("Customer 4");
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		
		//t2.join();
		//t3.join();
		t4.start();
		//t4.join();
	}
}
