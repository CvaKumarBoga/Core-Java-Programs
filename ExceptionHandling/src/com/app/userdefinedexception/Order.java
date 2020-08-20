package com.app.userdefinedexception;

import java.util.Scanner;

public class Order {

	static String actualDeliveryAddr = "Kadapa";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter delivery address: ");
		String str = s.next();
		try {
			if(!str.equals(actualDeliveryAddr)) {
				throw new InvalidDeliveryAddress("You are entered invalid address..");
			}
			else {
				System.out.println("Delivery is succesfull..");
			}

		} catch (InvalidDeliveryAddress e) {
			e.printStackTrace();
		}
		System.out.println("\nHave a nice day!!...");
	}
}
/*
 * Output: 
 * 		Enter delivery address: Kadapa 
 * 			
 * 		Delivery is succesfull..
 * 
 * 		Have a nice day!!...
 *
 * Output:
 * 		Enter delivery address: Rajampet
 *		com.app.userdefinedexception.InvalidDeliveryAddress: You are entered invalid address..
 * 
 * 		Have a nice day!!... at
 * 		com.app.userdefinedexception.Order.main(Order.java:16)
 */

