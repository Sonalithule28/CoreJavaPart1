package com.Exception;

public class TestCustomException1 {
	static void validate(int age)throws InvalidAgeException{
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("Welcome to vote");
	}

	
	public static void main(String[] args) {
 try {
	validate(12);
} catch (Exception e) {System.out.println("Exception occured:"+e);}
 System.out.println("rest of the code.....");
}
	}


