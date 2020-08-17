package com.app;

import java.util.Scanner;

public class Sample {

	public void reverseString(String s) {
		char[] charArray = s.toCharArray();
		if(!((charArray.length)<2)) {
			for(int i=charArray.length-1;i>=0;i--) {
				System.out.print(charArray[i]);
			}
		}
		else {
			System.out.println("Enter valid string");
		}
	}

	public void reverseNumber(int number) {
		int reverse = 0;
		int length = (int) Math.log10(number)+1;
		if(!(length<2)) {
			while(number!=0) {
				reverse = reverse*10;
				reverse = reverse + number%10;
				number = number/10;
			}
			System.out.println(reverse);
		}
		else {
			System.out.println("Entere a valid number.");
		}
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String reversestr = scanner.next();
		System.out.println("Enter a Integer number: ");
		int reverseint = scanner.nextInt();

		Sample sample = new Sample();
		System.out.print("The reverse of a string is: ");
		sample.reverseString(reversestr);
		System.out.print("\nThe reverse of a integer is: ");
		sample.reverseNumber(reverseint);

	}
}
