package com.app.overloading;

/*
 * The process of specifying multiple methods having different signature(no.of parameters,order of 
 * parameters,type of parameters, and same method name is 
 * called method overloading.
 */
public class MethodOverloading {
	
	public int doSomething(int a,int b) {
		System.out.println("First method.");
		return a+b;
		
	}
	public double doSomething(double a,double b) {
		System.out.println("Second method.");
		return a+b;
		
	}

	/*
	 * In this case the compiler will decide which method has to be execute and
	 * therefore called compile time polymorphism.
	 */
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.doSomething(11, 11);
		m.doSomething(11f, 11f);
	}

}
