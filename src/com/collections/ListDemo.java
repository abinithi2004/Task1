package com.collections;
//import java.util.ArrayList;
import java.util.*;
public class ListDemo {
public static void main(String[] args) {
	//ArrayList al=new ArrayList();
	//Stack al=new Stack();
   //LinkedList al=new LinkedList(); //push and pop
	//HashSet al=new HashSet();
    TreeSet al=new TreeSet();
	al.add("Mango");
	al.add("Apple");
	al.add("Purple");
	al.add(45);
	al.add('x');
	al.add(55.66f);
	al.add("Mango");
	al.add("Orange");
	al.add("Banana");
	//al.add(33);
	al.add("mushroom");
	//for(Object o : al){
	//{
	//System.out.println(o);
	//}
	//Iterator itr=al.iterator(); //method
	//While(itr.hashNext()){ // any element is present
	//	System.out.println(itr.next()); // the return type of next method is object.
	//}
	al.forEach(x->{System.out.println(x);});//Lambdha expression
	al.forEach(System.out::println);//Method Reference
	//al.add('x');
	//al.remove(1);
	al.remove(45);
	//al.set(2, "Apple");
	//al.add(3, "Orange");
	//al.pop(); //re,move last element
	//al.push("Banana"); //add element in last
	//al.peak(); //to find an element
	//System.out.println(al.get(0));
	System.out.println(al);
//System.out.println(al.contains("Apple")); // contains method return type is boolean
// System.out.println(al.size());
}

}
