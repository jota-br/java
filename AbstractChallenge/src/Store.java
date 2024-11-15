import java.util.ArrayList;

record OrderItem (int quantity, ProductForSale product) {}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>(100);

    public static void main(String... args) {

        storeProducts.add(new Shoe("Nike Air Maxx", 99, "New comfortable running shoe"));
        storeProducts.add(new Shoe("Adidas Cloud", 129, "Smart foam"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);
    }

    public static void listProducts() {

        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {

        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice((item.quantity()));
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
