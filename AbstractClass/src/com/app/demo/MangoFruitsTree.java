package com.app.demo;

/*
 * A class is declare a abstract keyword is called abstract class.
 * A abstract class can contain abstract methods and concrete methods.
 * When a method contains method declaration without definition is called abstract method.
 * An abstract class can not be create an object.Because it contains concrete and abstract methods
 * if we create an object of abstract class by using that obj reference we can perform unsafe operations.
 * If */
public abstract class MangoFruitsTree {
	
	public void color() {
		System.out.println("Mangos color is yellow!!...");
	}
	
	public void taste() {
		System.out.println("Mangos taste is very sweet!!...");
	}
	public abstract void usageOfMangos();
	public abstract void cost();

}
