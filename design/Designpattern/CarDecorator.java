package com.design.pattern;

interface Car {
	public String getCarDescription();

	public double assemblerCost();
}

class BasicCar implements Car {

	@Override
	public String getCarDescription() {
		// TODO Auto-generated method stub
		return "Basic Car";
	}

	@Override
	public double assemblerCost() {
		// TODO Auto-generated method stub
		return 400;
	}

}

abstract class CarDeco implements Car {
	Car car;

	public CarDeco(Car car) {
		super();
		this.car = car;
	}
}

class LuxuryCar extends CarDeco {

	public LuxuryCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCarDescription() {
		// TODO Auto-generated method stub
		return car.getCarDescription() + "Luxuray Car";
	}

	@Override
	public double assemblerCost() {
		// TODO Auto-generated method stub
		return car.assemblerCost() + 600000;
	}

}

class SportCar extends CarDeco {

	public SportCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCarDescription() {
		// TODO Auto-generated method stub
		return car.getCarDescription() + "Sports Car";
	}

	@Override
	public double assemblerCost() {
		// TODO Auto-generated method stub
		return car.assemblerCost() +9000;
	}

}

public class CarDecorator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCar bc = new BasicCar();
		LuxuryCar lc = new LuxuryCar(bc);
		System.out.println("Cost of Luxury Car:" + lc.assemblerCost());
		System.out.println(lc.getCarDescription());
		BasicCar bc1 = new BasicCar();
		SportCar sc = new SportCar(bc1);
		System.out.println("Cost of SportsCar:" + sc.assemblerCost());
		System.out.println(sc.getCarDescription());
	}

}
