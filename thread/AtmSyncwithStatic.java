package com.thread;

class AtmSyncwithStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<4; i++) {
			AccountHolder t = new AccountHolder();
			t.setName("Person" +i );
			t.start();
		}
		

	}

}
class ATMcenter{
	static synchronized void userAction() {
		System.out.println(Thread.currentThread().getName() + "entered");
		System.out.println("Performed transaction");
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
				System.out.println("thread interrupted");
		}
		System.out.println(Thread.currentThread().getName() + "transaction complete");
		System.out.println(Thread.currentThread().getName() + "leaving......");
		System.out.println("**********************************");	
	
	}
}
class AccountHolder extends Thread{
	
	public void run() {
		ATMcenter.userAction();
	}
	

}
