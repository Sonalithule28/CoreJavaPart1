package oopsprogram;

class vehicle {
	int speed = 60;

}

class Bike extends vehicle {
	int speed = 120;

	void display() {

		System.out.println(super.speed);
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.display();

	}

}

