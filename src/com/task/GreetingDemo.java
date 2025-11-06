package com.task;
public class GreetingDemo {
    public static void main(String[] args) {
        Greeting greet = (name) -> System.out.println("Hello, " + name + "!");
        greet.sayHello("Ravi");
    }
}
//Fuctional interface with one abstract method using lambda expressions