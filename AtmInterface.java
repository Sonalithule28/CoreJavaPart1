package com.MiniCoreJavaPrj;

import java.util.Scanner;

public class AtmInterface
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int bal =600, withdraw,deposit,n = 0;
		int pin=8888;
	
		Scanner sc=new Scanner(System.in);
		Scanner keyboard=new Scanner(System.in);

		System.out.println("**WELCOME TO ATM**");
		System.out.println("Insert a card");
		System.out.println("Enter Your PIN:");
		int entry=keyboard.nextInt();
		while (entry!=pin)
		{
			System.out.println("\n Incorrect PIN Try Again...!");
			System.out.println("Enter Your PIN:");
			entry=keyboard.nextInt();
			}
		do
		
		{	System.out.println("1.Withdraw :");
			System.out.println("2.Deposit :");
			System.out.println("3.Balance :");
			System.out.println("4.Transfer and Payments :");
			System.out.println("5.Exit :");
			System.out.println("Enter Your Choice:");
		
		
		int n1=sc.nextInt();
		switch (n1)
		{
		case 1:System.out.println("Enter amount to withdraw:");
		
		withdraw=sc.nextInt();
		if (bal>withdraw)
		{
			bal = bal - withdraw;  
			System.out.println("Please collect your amount....");
			
		} else 
			System.out.println("Insufficiaent balance..!");
			System.out.print("   ");
			
			break;
				
		case 2:System.out.println("Enter amount to deposit:");
		deposit=sc.nextInt();
		bal=bal+deposit;
		System.out.println("Your Amount is Deposited......!");
		System.out.println("  ");
		break;
		
		case 3:System.out.print("bal="+bal);
		System.out.println(" ");
		break;
		case 4:System.out.println("contact to bank for details of transfer and payments....");
		break;
		case 5:System.exit(0);
		default:
		    System.out.println("Invalid Input");

		}
		}
		
		while(n!=5)	;
		
		
	

}
}
