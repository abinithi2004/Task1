package com.task;
import java.util.LinkedList;
public class CollectionOperations {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("A");
	        list.add("B");
	        list.add("C");
	        System.out.println("LinkedList: " + list);
	        list.addFirst("Start");
	        list.addLast("End");
	        System.out.println("After addFirst & addLast: " + list);
	        list.removeFirst();
	        list.removeLast();
	        System.out.println("After removeFirst & removeLast: " + list);
	        //  LIFO
	        list.push("Stack1");  // Push
	        list.push("Stack2");
	        System.out.println("After Stack Push: " + list);
	        String popped = list.pop();  // Pop
	        System.out.println("Popped from Stack: " + popped);
	        System.out.println("After Stack Pop: " + list);
	        //  FIFO
	        list.offer("Queue1");  // Enqueue
	        list.offer("Queue2");
	        System.out.println("After Queue Offer: " + list);
	        String polled = list.poll();  // Dequeue
	        System.out.println("Polled from Queue: " + polled);
	        System.out.println("After Queue Poll: " + list);
	    }
	}
	
