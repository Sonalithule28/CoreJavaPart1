package com.design.pattern;
abstract class Pizza{
	String description="Simple Pizza";
	public String getDescription() {
		return description;
	}
	abstract double cost();
	
}
class ThickPizza extends Pizza{
	public ThickPizza() {
		description="This is Thick Pizza";
	}
public  String getThik() {
		
		return description;
	}
	public double cost() {
		return 100.0;
	}
	
}

class ThinPizza extends Pizza{
	public ThinPizza() {
		description="This is Thin Pizza";
	}
	public String getThin() {
		return description;
	
	}
	public double cost() {
		return 250.0;
	}
}
abstract class PizzaDecorator extends Pizza {
	Pizza pizza;

	PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	public abstract String getDescription();
}

class Olives extends PizzaDecorator {

	Olives(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "With  Olives";
	}

	@Override
	public double cost() {
		return 80.5;
	}
}

class Cheese extends PizzaDecorator {

	Cheese(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " With Cheese";
	}

	@Override
	public double cost() {
		return 60.6;
	}
}



public class PizzaStoreStructural {
	public static void main(String[] args) {
		Pizza pizza=new ThinPizza();
		Pizza Cheese = new Cheese(pizza);
		System.out.println(Cheese.getDescription()+"Cost:"+Cheese.cost());
		Pizza Olives=new Olives(pizza);
		System.out.println(Olives.getDescription()+"Cost:"+Olives.cost());
		ThickPizza tn=new ThickPizza();
		System.out.println(tn.getThik()+"Cost:"+tn.cost());
		ThinPizza tk = new ThinPizza();
		
		System.out.println(tk.getThin()+"Cost:"+tk.cost());
		
			
		}

}
