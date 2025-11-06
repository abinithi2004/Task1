package com.task;
public class Student {
	 private String name;
	    private int rollNo;
	    private String grade;
		public Student(String string, int i, String string2) {
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", rollNo=" + rollNo + ", grade=" + grade + "]";
		}
	  public static void main(String[] args) {
		  Student s1 = new Student("Ravi", 101, "A");
	        System.out.println(s1);  // Calls toString()
	        // Update details using setters
	        s1.setName("Priya");
	        s1.setGrade("B");
	        // Access updated details using getters
	        System.out.println("Updated Name: " + s1.getName());
	        System.out.println("Updated Grade: " + s1.getGrade());
	        System.out.println(s1);  // Updated toString()
	}  
}
//Encapsulation using getter and setter methods and calls the toString().