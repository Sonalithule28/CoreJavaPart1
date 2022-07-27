package com.thread;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw.....");
		if (this.amount < amount) {
			System.out.println("Less balance ; waiting for deposit..");
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
			this.amount -= amount;
			System.out.println("withdraw complete....");
		}
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposit.....");
		this.amount  += amount;
		System.out.println("deposit completed...");
		notify();
	}

	

}

class SynchronisedEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
final Customer c=new Customer();
new Thread() {
	public void run() {
		c.withdraw(50000);
		
	}
	}.start();

	new Thread() {
		public void run() {
			c.deposit(10000);
		}		
	}.start();

	
	
	}

}
	
