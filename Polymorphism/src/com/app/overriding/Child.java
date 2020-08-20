package com.app.overriding;

public class Child extends Parent{
	
	public void property() {
		int property = 5;
		int hisProperty = 2;
		System.out.println("Child got "+property+"cros property of parent in 2019.");
		System.out.println("Child having "+(property+hisProperty)+"cros property 2021.");
	}

	/*
	 * static methods can't be overriding because static method is invoked by class
	 * loading time but overriding concept is related to load runtime and static
	 * method is share the same copy of data in every object.
	 */
	public static void DNA() {
		final String str= "negative";
		System.out.println("Child is tested DNA test result is: "+str);
	}

}
