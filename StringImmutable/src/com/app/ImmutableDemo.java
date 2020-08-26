package com.app;

public class ImmutableDemo {
	public static void main(String[] args) {
		Integer a = 10;
		System.out.println("Before: "+a);
		a = a+10;
		System.out.println("After: "+a+"\n");
		
		String s1 = new String("Hello");
		System.out.println(s1 +"-> HashCode: "+s1.hashCode());
		
		/*
		 * If you tried to change the contents of object using concat() object content
		 * is not modifying
		 */
		s1.concat("Siva");
		System.out.println(s1 +"-> HashCode: "+s1.hashCode());
		
		/* If I forcefully change the content of an object it will create new object. */
		s1 = s1+"Siva";
		System.out.println(s1 +"-> HashCode: "+s1.hashCode());
	}

}
/**
OutPut:
	Before: 10
	After: 20

	Hello-> HashCode: 69609650
	Hello-> HashCode: 69609650
	HelloSiva-> HashCode: -1094331565
*/