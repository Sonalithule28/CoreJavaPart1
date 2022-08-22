package com.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

	public class EmployeeRunner {
		public static List<Emp> getEmployeedetails(){
				List<Emp> emp = new ArrayList<Emp>();
				emp.add(new Emp(1,"Janu",40000));
				emp.add(new Emp(2,"Sonu",99000));
				emp.add(new Emp(3,"Ashwini",45000));
				emp.add(new Emp(4,"Panu",80000));
				return emp;
		}
		
		  public static void main(String[] args) 
		  {
			  List<Emp> l=getEmployeedetails();
		  
		  
		  Predicate<Emp> e1 = e-> ((String) e.getName()).startsWith("S"); boolean b1 =
		  l.stream().anyMatch(e1); System.out.println("AnyMatch result:"+b1); }
		 
		

	}






