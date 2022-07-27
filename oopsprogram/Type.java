package oopsprogram;
 class PersonDetails{
	 PersonDetails(String name,String city,int age){
		 System.out.println("Person Name:"+name);
		 System.out.println("Person City:"+city);
		 System.out.println("Person Age:"+age);
		  }
 
 }
  class Type1 extends PersonDetails{
	  String course="Java Fullstack Developer";
	  public Type1() {
		  super("Sonali","Palghar",22);
		  
		  }
	  public void getDetails() {
			 System.out.println("Learner Details:");

		  }
  }
  public class Type{
 
 public static void main(String[] args) {
	 Learner l= new Learner();
	 l.getDetails();
	 
 }
 }

	


