package com.exception;

public class InvalidAgeException extends Exception{
 int age;
 public InvalidAgeException(int a) {
	// TODO Auto-generated constructor stub
}
 public void InvalidAgeException(int Age) {
	 this.age=age;
 }
 @Override
 public String toString() {
	return "InvalidAgeException [age=" + age + "]";
 }
 
}
