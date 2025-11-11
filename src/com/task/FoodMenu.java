package com.task;
import java.util.ArrayList;
import java.util.List;
class Pizza implements Food {
public void serve() {
	System.out.println("Serving hot cheesy Pizza!");
}
}
	class Burger implements Food {
		@Override
		public void serve() {
			System.out.println("Serving crispy Burger with fries!");
		}
	}
	public class FoodMenu{
	 public static void main(String[] args) {
	        List<Food> menu = new ArrayList<>();
	        menu.add(new Pizza());
	        menu.add(new Burger());
	        System.out.println("Today's Menu:");
	        for (Food item : menu) {
	            item.serve();
}
	 }
	}

