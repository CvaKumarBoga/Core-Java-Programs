package com.app.overriding;

/*
 * If we are writing a method in child class that same method is existing in parent class is called
 * method overriding.The main advantage of overriding is child class implementing there own logic.
 */
public class MethodOverriding {
	public static void main(String[] args) {
		/* Asper java documentation static methods call by using class name only. */
		Parent p = new Parent();
		p.property();
		Parent.DNA();
		System.out.println();

		Child c = new Child();
		c.property();
		/*
		 * child is not possible to changing his DNA because parent DNA method is
		 * static.
		 */		
		Parent.DNA();

	}
}
/* Output: 
 * Parent share 5cros property to his Child in 2019.
 * Parent and child is tested DNA test result is: positive
 
 * Child got 5cros property of parent in 2019.
 * Child having 7cros property 2021.
 * Parent and child is tested DNA test result is: positive
 */
