public class SmartKitchen {
    
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeMaker, boolean iceBox, boolean dishWasher) {
        this.brewMaster.setHasWorkToDo(coffeeMaker);
        this.iceBox.setHasWorkToDo(iceBox);
        this.dishWasher.setHasWorkToDo(dishWasher);

    }

    public void doKitchenWork() {
        if (brewMaster.getHasWorkToDo()) {
            brewMaster.brewCoffee();
        }

        if (iceBox.getHasWorkToDo()) {
            iceBox.orderFood();
        }

        if (dishWasher.getHasWorkToDo()) {
            dishWasher.doDishes();
        }
    }
}
