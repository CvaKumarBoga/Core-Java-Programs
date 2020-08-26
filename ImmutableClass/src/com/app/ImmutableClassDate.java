package com.app;

import java.util.Date;
/*This Java class is immutable, because its state can not be changed once created. Whenever call
 * final in class let can't apply Inheritance and polymorphism. */
public final class ImmutableClassDate {
	
	private final Date date;
	
	public ImmutableClassDate(Date date) {
		
		if(date.getTime() < System.currentTimeMillis()) {
			throw new IllegalArgumentException();
		}
		this.date = date;
	}
	
	public Date getDate() {
		return (Date) date.clone();
	}
	
	
	@Override
	public String toString() {
		return "ImmutableClassDate [date=" + date + "]";
	}

	public static void main(String[] args) {
		ImmutableClassDate m = new ImmutableClassDate(new Date());
		System.out.println(m);
	}

	/*
	 * 1) Immutable objects are by default thread safe. 
	 * An immutable object simplifies development, because its easier to share between multiple 
	 * threads without external synchronization. 
	 * Another important benefit of Immutable objects is reusability, you can cache Immutable 
	 * object and reuse them, much like String literals and Integers.
	 */

}
