package com.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        Integer result = func.apply(6, 6);
        System.out.println("add:"+result); 

        // take two Integers & return as Double
        BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1, x2);
        Double result2 = func2.apply(6, 2);
        System.out.println(result2);    

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);
        List<Integer> result3 = func3.apply(4, 8);
        System.out.println(result3);

        
        BiFunction<Integer, Integer, Integer> f1=(a1,a2)->a1+a2;
        Integer result1 = f1.apply(9,3);
        System.out.println(result1); 	
	}

}


