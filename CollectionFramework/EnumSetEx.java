package com.CollectionFramework;
import java.util.EnumSet;
import java.util.Iterator;
enum Color {
	RED, GREEN, YELLOW, BLACK, ORANGE, BLUE;
}

public class EnumSetEx {
	public static void main(String[] args) {
		EnumSet<Color> c = EnumSet.allOf(Color.class);
		EnumSet<Color> c1 = EnumSet.noneOf(Color.class);

//		System.out.println("Empty set will print: " + c);
	//	EnumSet<Color> c11 = EnumSet.range(Color.RED, Color.BLACK);
//		System.out.println("Elements in Enum are: " + c11);
//	EnumSet<Color> c111 = EnumSet.allOf(Color.class);
	//	Iterator<Color> itr1 = c111.iterator();
	//while (itr1.hasNext()) {

	//		System.out.println("Elements in Enum are: " + itr1.next());
	//	}
		c.remove(Color.BLUE);
		System.out.println("Elements in Enum are: " + c);
		c1.add(Color.YELLOW);
		c1.add(Color.GREEN);

		System.out.println("Elements in Enum are: " + c1);

//	Iterator<Color> itr = c111.iterator();	
	//while (itr.hasNext()) {
	//	System.out.println("Elements in Enum are: " + itr.next());
//	}

	}

}


