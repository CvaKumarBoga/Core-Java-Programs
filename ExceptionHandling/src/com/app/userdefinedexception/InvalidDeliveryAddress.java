package com.app.userdefinedexception;

@SuppressWarnings("serial")
public class InvalidDeliveryAddress extends Exception {
	
	public InvalidDeliveryAddress(String str) {
		super(str);
	}

}
