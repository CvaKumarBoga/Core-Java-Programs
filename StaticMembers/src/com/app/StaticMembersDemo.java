package com.app;

public class StaticMembersDemo {

	int a = 12;
	static int b = 20;

	/* 
	 * Instance method can access both instance and static members 
	 */
	public void show() {
		System.out.println(a);
		System.out.println(b);
	}
	/*
	 * Static method can't access the instance members of a class 
	 * but we can access by using object reference.
	 */	
	public static void display() {
		//System.out.println(a);
		System.out.println(b);	
	}
	public static void main(String[] args) {
		
		/* 
		 * Each and every object(s1,s2,s3) will share same copy of static variable i.e 12 
		 * and static methods can't be overriding because 
		 * static means fixed copy
		 * overriding means implementing new to existing method
		 */
		
		StaticMembersDemo s1 = new StaticMembersDemo();
		s1.show();
		StaticMembersDemo.display();
		s1.a++;
		StaticMembersDemo.b++;
		System.out.println(s1.a +" : "+ StaticMembersDemo.b);
		
		StaticMembersDemo s2 = new StaticMembersDemo();
		s2.a++;
		StaticMembersDemo.b++;
		System.out.println(s2.a +" : "+ StaticMembersDemo.b);
		
		StaticMembersDemo s3 = new StaticMembersDemo();
		s3.a++;
		StaticMembersDemo.b++;
		System.out.println(s3.a +" : "+ StaticMembersDemo.b);
		
		/*
		 * static member can access instance member by using object reference only not
		 * class name.
		 */
		System.out.println(s1.a);
		
	}
}
/*
 * Output: 
 * 		12 
 * 		20 
 * 		20 
 * 		13 : 21 
 * 		13 : 22 
 * 		13 : 23
 */