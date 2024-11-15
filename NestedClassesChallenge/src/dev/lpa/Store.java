package dev.lpa;

public class Store {

    public static void main(String[] args) {

        Meal regularMeal = new Meal();
        System.out.println(regularMeal);

        Meal USRegularMeal = new Meal(0.68);
        System.out.println(USRegularMeal);

        Meal specialBurguer = new Meal(1, "cheese", "mayo", "pickles");
        System.out.println(specialBurguer);
    }
}
