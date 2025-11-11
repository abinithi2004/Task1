package com.task;
import java.util.HashSet;
public class HashSetEx {
public static void main(String[] args) {
	 HashSet<Integer> num = new HashSet<>();
     num.add(10);
     num.add(20);
     num.add(10);  // Duplicate, won't be added
     System.out.println("Numbers: " + num);
 }
}
