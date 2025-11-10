package com.exception;

public class EXCEPTION {
public static void main(String[] args) {
	int x=22;
	int y=0;
	try {
		System.out.println("Welcome to Division Program");
		System.out.println("Division of "+x+" / "+y+"is "+(x/y));
	}
	catch(ArithmeticException e) {
		System.out.println("Please enter non zero value "+e);
}
	System.out.println("Bye...");
}
}