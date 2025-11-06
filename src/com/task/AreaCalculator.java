package com.task;
public class AreaCalculator {
    public void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }
    public void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
    public void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        calc.area(3);             
        calc.area(4, 6);          
        calc.area(3.5);          
    }
}//method overloading in polymorphism.
