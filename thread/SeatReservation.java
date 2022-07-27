package com.thread;

 class SeatReservation {

	public static void main(String[] args)
	{
	
	Reservation reserves = new Reservation();;
	Person  thread1 = new Person(reserves,5); 
	thread1.start();
	Person thread2 = new Person(reserves, 3);
	thread2.start();
	Person thread3 = new Person(reserves, 1);
	thread3.start();
    }

}
 class Reservation
 {
	 static int availableSeats =10;
	 synchronized void reserveSeat(int requestSeats)
	 {
		 System.out.println(Thread.currentThread().getName() + "entered.");
		 int requestedseats = 0;
		System.out.println("Availableseats:" + availableSeats  +  "Requestedseats:" + requestedseats);
		 if (availableSeats >= requestedseats)
		 {
			 System.out.println("Seat Available. Reserve now:-");
			 try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Thread interrupted");
			}
			 System.out.println(requestedseats + "seats reserved.");
			 int requstedseats = 0;
			availableSeats = availableSeats - requstedseats;
		 }
		 else {
			 System.out.println("Requested seats not available:-");
		 }
		 System.out.println(Thread.currentThread());
		 System.out.println("****************************************************");
	 }
	
 }
 class Person extends Thread
 {
	 Reservation reserves;
	 int requestedseats;
	 
	
	public Person(Reservation reserves, int requestedseats ) {
		 this.reserves = reserves;
		 this.requestedseats = requestedseats;
		
	}

	
	@Override
	public void run() {
		
		reserves.reserveSeat(requestedseats);
	}
	 
 }
 
 
 
 
 
 
 