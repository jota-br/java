public class Burguer {
    private String type;
    private double price;
    private boolean extraPickles;
    private boolean extraCheese;
    private boolean extraBurguer;
    private boolean extraEggs;
    private boolean extraSalse;

    public Burguer(String type, double price) {
        this.type = switch (type.toLowerCase()) {
            case "deluxe" -> "Deluxe Burguer";
            default -> "Regular Burguer";
        };
        this.price = price;
    }

    public void toppings(boolean extraPickles, boolean extraCheese, boolean extraBurguer) {
        this.extraPickles = extraPickles;
        this.extraCheese = extraCheese;
        this.extraBurguer = extraBurguer;
    }

    public void toppings(boolean extraPickles, boolean extraCheese, boolean extraBurguer, boolean extraEggs,
            boolean extraSalse) {
        this.extraPickles = extraPickles;
        this.extraCheese = extraCheese;
        this.extraBurguer = extraBurguer;
        this.extraEggs = extraEggs;
        this.extraSalse = extraSalse;
    }

    public double getPrice() {
        if (this.type == "Deluxe Burguer") {
            return this.price;
        }
        double total = 0;
        total += (this.extraBurguer) ? 2.00 : 0;
        total += (this.extraCheese) ? 1.25 : 0;
        total += (this.extraPickles) ? 1.50 : 0;
        total += this.price;
        return total;
    }

    public String getType() {
        return type;
    }

    public StringBuilder getToppings() {
        String pickles = (extraPickles) ? "+pickles " : "";
        String cheese = (extraCheese) ? "+cheese " : "";
        String burguer = (extraBurguer) ? "+burguer " : "";
        String eggs = (extraEggs) ? "+eggs " : "";
        String salse = (extraSalse) ? "+salse " : "";
        return new StringBuilder(pickles + cheese + burguer + eggs + salse);
    }
}
