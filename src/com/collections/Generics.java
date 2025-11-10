package com.collections;
import java.util.*;
public class Generics {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Mango");
	al.add("Apple");
	al.add("Grapes");
	al.add("Papaya");
	al.add("Mango");
	al.add("Orange");
	al.add("Banana");
	for(String s:al){
	System.out.println(s);
}
Iterator itr=al.iterator();
while(itr.hasNext()) {
	System.out.println((String)itr.next());
}
}
}
