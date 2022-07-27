package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByPrice implements Comparator<Phone> {

	@Override
	public int compare(Phone o1, Phone o2) {
		return o1.getPrice() - o2.getPrice();
	}

}

class SortByName implements Comparator<Phone> {

	@Override
	public int compare(Phone o1, Phone o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

public class PhoneComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Phone> phone = new ArrayList<Phone>();
		phone.add(new Phone(50000, "SAMSUNG", "Janu"));
		phone.add(new Phone(150000, "APPLE", "Sonu"));
		phone.add(new Phone(70000, "XIOMI", "Sam"));
		phone.add(new Phone(90000, "ONE PLUS", "Champ"));
		System.out.println("List before sorting: ");
		for (Phone ph : phone) {
			System.out.println("Phone: " + ph + "");
		}

		Collections.sort(phone, new SortByPrice());
		System.out.println("Sorted by Names:\n " + phone);

		Collections.sort(phone, new SortByName());
		System.out.println("Sorted by Id:\n " + phone);
	}
}
