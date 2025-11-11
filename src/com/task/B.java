package com.task;

public class B implements A {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello from class B");
	}
public static void main(String[] args) {
	 A obj = new B();  // Interface reference to class object
     obj.display();    // Calls method from class B
}
}
//interface  with classes