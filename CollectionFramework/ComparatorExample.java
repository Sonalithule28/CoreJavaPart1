package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeSortByNames implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

class EmployeeSortById implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getId() - e2.getId();
	}
}

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Janu"));
		employees.add(new Employee(2, "Sonu"));
		employees.add(new Employee(4, "Champ"));
		employees.add(new Employee(3, "Sam"));

		System.out.println("List before sorting: ");
		for (Employee employee : employees) {
			System.out.println("Employee: " + employee + "");
		}

		Collections.sort(employees, new EmployeeSortByNames());
		System.out.println("Sorted by Names:\n " + employees);

		Collections.sort(employees, new EmployeeSortById());
		System.out.println("Sorted by Id:\n " + employees);
	}

}
