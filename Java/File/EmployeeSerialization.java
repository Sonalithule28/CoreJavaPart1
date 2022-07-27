package com.Java.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	public static void main(String[] args)throws IOException {
		FileOutputStream fi=new FileOutputStream("d://serial1.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fi);
      // Employees e=new Employees();
     //  e.name="Sonali";
     //  e.id=2;
      // e.city="Mumbai";
     //  obj.writeObject(e);
     //  System.out.println("Data is saved.... ");
		Employees e1= new Employees();
		e1.setName("Janhavi");
		e1.setId(1);
		e1.setCity("Pune");
		
		Employees e2= new Employees();
		e2.setName("Janhavi");
		e2.setId(2);
		e2.setCity("Mumbai");
		
		Employees e3= new Employees();
		e3.setName("champ");
		e3.setId(3);
		e3.setCity("Thane");
		
		obj.writeObject(e1);
		obj.writeObject(e2);
		obj.writeObject(e3);
		
		System.out.println("All employees data is saved.");
	}
}
