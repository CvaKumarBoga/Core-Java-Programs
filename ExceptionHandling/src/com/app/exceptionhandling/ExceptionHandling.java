package com.app.exceptionhandling;

/* An Exception is a runtime error which occurs because of programmer failure.
 * 
 * Exception handling is a process of finding alternate solution so that remaining code is executed 
 * completely and terminates normally.The writing code is perform exception handling will be called 
 * exception handling.
 */
public class ExceptionHandling {
	public static void main(String[] args) {

		System.out.println("Hai Siva!..");
		System.out.println("Hai Ravi!..");

		/* Here Exception is occur the remaining statements are not executed so program is terminate 
		 * without executing remaining statements.
		 */

		/* Handling Exception */
		try {
			int a = 55;
			int b = 0;
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Bye Ravi...");
		System.out.println("Bye siva...");
	}
}
