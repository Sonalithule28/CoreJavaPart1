package com.design.pattern;
class Bmw implements CarModel{

	@Override
	public void build() {
		System.out.println("This is BMW");
		
	}
	public double cost() {
		return 1000000;
		
	}
}
class MarutiSuzuki implements CarModel{

	@Override
	public void build() {
		System.out.println("This is MarutiSuzuki");
		
	}
	public double cost() {
		return 3000000;
		
	}
}
class Renault implements CarModel{

	@Override
	public void build() {
		System.out.println("This is RENAULT");
		
	}
	public double cost() {
		return 2000000;
		
	}
}
class FacdeCar{
	CarModel bmw,marutisuzuki,renault;
	
	public FacdeCar() {
		super();
		this.bmw=new Bmw();
		this.marutisuzuki=new MarutiSuzuki();
		
		this.renault=new Renault();
		
	}

	
	public void buildBmw() {
		// TODO Auto-generated method stub
		bmw.build();
	}
	
	public  double cost() {
		// TODO Auto-generated method stub
		
		return 1000000;
	}


	public void buildMarutiSuzuki() {
		// TODO Auto-generated method stub
		marutisuzuki.build();
	}

	public void buildRenault() {
		// TODO Auto-generated method stub
		renault.build();
	}
}

public class FacadeProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacdeCar fc=new FacdeCar();
		fc.buildBmw();
		fc.cost();
		fc.buildMarutiSuzuki();
		fc.buildRenault();
	}

}
