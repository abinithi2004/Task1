package com.task;
class Dog{
	void bark() {
		System.out.println("The Dog barks");
	}
}
public class Animal extends Dog {
 void eat() {
	 System.out.println("The Animal eats");
 }
 public static void main(String[] args) {
	Animal d=new Animal();
     d.eat();
	 d.bark();
  }
}//Single Inheritance
