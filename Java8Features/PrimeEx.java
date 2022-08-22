package com.Java8Features;

public class PrimeEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeInterface1 msg1=(num) ->{
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					int count = 0;
					count++;
					if(count==2) {
						System.out.println("Prime Number");
				}else {
					System.out.println("Not Prime Number");
				}
			}
				
				
				}
			return "PrimeNo";
			
			
			 
		
		};
			System.out.println("Prime Number:"+msg1.PrimeNo(1));
				
			
			

	}

}


