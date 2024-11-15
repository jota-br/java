public class Main {
    
    public static void main(String[] args) {
        DishWasher dishWasher = new DishWasher(false);
        Refrigerator refrigerator = new Refrigerator(false);
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, dishWasher, refrigerator);

        smartKitchen.addWater();
        smartKitchen.pourMilk();
        smartKitchen.loadDishwasher();
        smartKitchen.doKitchenWork();
    }
}
