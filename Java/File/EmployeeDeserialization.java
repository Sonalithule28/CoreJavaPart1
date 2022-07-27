package com.Java.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fois = new FileInputStream("d://serial1.txt");
		ObjectInputStream obj = new ObjectInputStream(fois);
		Employees e1 = (Employees) obj.readObject();
		Employees e2 = (Employees) obj.readObject();
		Employees e3 = (Employees) obj.readObject();
		System.out.println("Employees details are:");
		System.out.println("\nId:" + e1.id + "\nName:" + e1.name + "\ncity:" + e1.city);
		System.out.println("\nId:" + e2.id + "\nName:" + e2.name + "\ncity:" + e2.city);
		System.out.println("\nId:" + e3.id + "\nName:" + e3.name + "\ncity:" + e3.city);


	}

}
