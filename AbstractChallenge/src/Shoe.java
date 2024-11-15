
public class Shoe extends ProductForSale {

    public Shoe(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

        System.out.println("Product: " + type + "\nDescription: " + description + "\nPrice: " + price);
    }
}
