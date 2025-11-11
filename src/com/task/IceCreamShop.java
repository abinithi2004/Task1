package com.task;
import java.util.ArrayList;
import java.util.List;

class IceCream {
    private String flavor;
    private double price;

    // Constructor
    public IceCream(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    // Setter for flavor
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return "IceCream [Flavor: " + flavor + ", Price: ₹" + price + "]";
    }
}
public class IceCreamShop {
    public static void main(String[] args) {
        List<IceCream> menu = new ArrayList<>();
        menu.add(new IceCream("Vanilla", 50.0));
        menu.add(new IceCream("Chocolate", 60.0));
        menu.add(new IceCream("Strawberry", 55.0));
        System.out.println("Ice Cream Menu:");
        for (IceCream ic : menu) {
            System.out.println(ic);
        }
        IceCream first = menu.get(0);
        first.setFlavor("Butterscotch");
        first.setPrice(65.0);
        System.out.println("\n Updated First Item:");
        System.out.println("Flavor: " + first.getFlavor());
        System.out.println("Price: ₹" + first.getPrice());
    }
}
//using getter and setter method and toString() method in Encapsulation and Collection methods
