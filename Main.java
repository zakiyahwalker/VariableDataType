package com.company;

public class Main {

    public static void main(String[] args) {
        int qty = 23;
        String name = "Walker Candy Shop";
        String type = "Airheads";
        float price = 0.25f;
        boolean inStock = true;

        System.out.println("Welcome to " + name +"!");
        System.out.println("Candy of the Day: " + type);
        System.out.println("Candy available to sell: " + inStock);
        System.out.println(type + " available? " + qty);
        System.out.println("Price: $" + price + " per piece");


    }
}
