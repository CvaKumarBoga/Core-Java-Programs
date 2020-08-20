package com.app;

public class Test {
	public static void main(String[] args) {
		EncapsulationDemo e = new EncapsulationDemo();
		//we can access public variable using encapsulation
		System.out.println("b: "+e.b);
		/*
		 * private variable can't access because Encapsulation is provide the hide the
		 * private variables.
		 * System.out.println(e.a);
		 */		
		/*
		 * If we are read or write private members by using getters or setters methods
		 * is provided by the class EncapsulationDemo.If EncapsulationDemo is provide get method
		 * we can read the data.If EncapsulationDemo is provide set method we can write the data.
		 */		
		System.out.println("a: "+e.getA());
		e.setA(100);
		System.out.println("a: "+e.getA());
	}

}
