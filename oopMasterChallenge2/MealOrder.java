public class MealOrder {
    
    private Burguer burguer;
    private Item drink;
    private Item side;

    public MealOrder() {
        this("regular", "coke", "fries");
    }

    public MealOrder(String burguerType, String drinkType, String sideType) {
        if (burguerType.equalsIgnoreCase("deluxe")) {
            this.burguer = new DeluxeBurguer(burguerType, 8.50);
        } else {
            this.burguer = new Burguer(burguerType, 4.00);
        }
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.50);
    }

    public double getTotalPrice() {
        if (burguer instanceof DeluxeBurguer) {
            return burguer.getAdjustedPrice();
        }

        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burguer.getAdjustedPrice();
    }

    public void printItemizedList() {

        burguer.printItem();
        if (burguer instanceof DeluxeBurguer) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurguerToppings(String extra1, String extra2, String extra3) {
        burguer.addToppings(extra1, extra2, extra3);
    }

    public void addBurguerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (burguer instanceof DeluxeBurguer db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burguer.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
