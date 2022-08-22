package com.interfacejava;


	import java.util.ArrayList;
	import java.util.List;

	public class ListCheck{
		public static void main(String[] args) {
			
		
		List<String> names=new ArrayList<String>();
		names.add("Sonali");
		names.add("Janhavi");
		names.add("Samir");
		names.add("champ");
		int count=0;
		{
		for(String str:names) {
		if(str.length()<6)
			count++;
	System.out.println("count name length<6>"+count);
		}
	}}
	}

