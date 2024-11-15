public class Order {
    
    private Burguer burguer;
    private Drink drink;
    private SideDish sideDish;

	public Order() {
        burguer = new Burguer("Small", 4.00);
        drink = new Drink("Coke", "Small");
        sideDish = new SideDish("Salad");
	}

	public Order(Burguer burguer, Drink drink, SideDish sideDish) {
		this.burguer = burguer;
		this.drink = drink;
		this.sideDish = sideDish;
	}

	public double getTotal() {
		return burguer.getPrice() + drink.getPrice() + sideDish.getPrice();
	}

    public void orderDetail() {
		System.out.println("_ _ _ _");
		System.out.format("Burguer -> %s with toppings %s for $%.2f%n", this.burguer.getType(), this.burguer.getToppings(), this.burguer.getPrice());
		System.out.format("Drink -> %s %s for $%.2f%n", this.drink.getType(), this.drink.getSize(), this.drink.getPrice());
		System.out.format("Side dish -> %s for $%.2f%n", this.sideDish.getType(), this.sideDish.getPrice());
		System.out.format("Total -> $%.2f%n", this.getTotal());
		System.out.println("_ _ _ _");
	}
}
