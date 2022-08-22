package com.Java8Features;

public class LambadaEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface msg=() ->{
				return "sonali";
				};
				System.out.println("With No Parameter:"+msg.callHello());
				
				MyFunctionalInterface1 msg1=(a) ->{
					if(a%2==0) {
						return"Even";					
				}else{
					return"Odd";
				}
				};
					System.out.println("With One Parameter:"+msg1.EvenOdd(6));
						
						MyFunctionalInterface2 msg2=(a ,b) ->{
							
							return (a+b);
								};
								System.out.println("With Two Parameter:"+msg2.add(1,1));
	}


}
