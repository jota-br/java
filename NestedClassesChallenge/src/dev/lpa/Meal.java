package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private double price = 5.0;
    private Burguer burguer;
    private Item drink;
    private Item side;

    private double conversionRate;

    public Meal() {
        this(1, "none");
    }

    public Meal(double conversionRate) {

        this.conversionRate = conversionRate;
        burguer = new Burguer("regular", "burger");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    public Meal(double conversionRate, String... toppings) {

        this.conversionRate = conversionRate;
        burguer = new Burguer("especial", "burger", toppings);
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal() {

        double total = burguer.price + drink.price + side.price;
        for (var t : burguer.toppings) {
            total += t.price;
        }
        return Item.getPrice(total, conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burguer, drink, side, "Total Due: ", getTotal());
    }

    private class Burguer {

        private String name;
        private String type;
        private double price;
        private List<Item> toppings;

        public Burguer() {
            this("regular", "burger", "none");

        }

        public Burguer(String name, String type, String... toppings) {

            this.toppings = new ArrayList<>();
            this.name = name;
            this.type = type;
            this.price = 5.0;

            for (var t : toppings) {

                double price = switch(t.toUpperCase()) {
                    case "CHEESE", "CHEDDAR", "BACON" -> 1.50;
                    case "PICKLES", "EGGS" -> 1.00;
                    case "SAUCE", "MAYO" -> 1.25;
                    default -> 0;
                };
                this.toppings.add(new Item(t, "extra", price));
            }
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f%n%15s".formatted(type, name, price, getToppings());
        }

        public String getToppings() {

            StringBuilder string = new StringBuilder();
            for (var t : toppings) {
                string.append("%10s%15s $%.2f%n".formatted(t.type, t.name, t.price));
            }
            return string.toString();
        }
    }
    private class Item {


        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? Meal.this.price : 0);
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name, getPrice(price, conversionRate));
        }

        private static double getPrice(double price, double rate) {
            return price * rate;
        }
    }
}
