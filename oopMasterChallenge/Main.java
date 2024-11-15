public class Main {

    public static void main(String[] args) {
        
        Burguer burguer = new Burguer("Small", 4.00);
        Drink drink = new Drink("Coke", "Small");
        SideDish sideDish = new SideDish("Fries");

        burguer.toppings(true, true, true);
        Order order = new Order(burguer, drink, sideDish);
        order.orderDetail();

        burguer = new Burguer("Deluxe", 6.00);
        drink = new Drink("Coke", "Medium");
        sideDish = new SideDish("Fries");

        burguer.toppings(true, true, true, true, true);
        order = new Order(burguer, drink, sideDish);
        order.orderDetail();
    }
}
