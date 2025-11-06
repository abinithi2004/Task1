package com.task;
public class MultilevelInheritance {
    static class Person {
        String name;
        void showPerson() {
            System.out.println("Person Name: " + name);
        }
    }
    static class Employee extends Person {
        String ID;
        void showEmployee() {
            System.out.println("Employee ID: " + ID);
        }
    }
    static class Manager extends Employee {
        String Dep;
        void showManager() {
            System.out.println("Department: " + Dep);
        }
    }
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Abi";
        m.ID = "0124D";
        m.Dep = "Service Desk";
        m.showPerson();
        m.showEmployee();
        m.showManager();
    }
}




	    