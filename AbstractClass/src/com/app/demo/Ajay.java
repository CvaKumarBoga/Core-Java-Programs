package com.app.demo;

public class Ajay extends MangoFruitsTree{

	@Override
	public void usageOfMangos() {
		System.out.println("For selling purpose.");
	}

	@Override
	public void cost() {
		System.out.println("One killo 80 Rupes.");
	}
	
	public static void main(String[] args) {
		Ajay a = new Ajay();
		a.color();
		a.taste();
		a.usageOfMangos();
		a.cost();
			
	}

}
