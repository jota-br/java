public class SideDish {
    
    private String type;
    private double price;

    public SideDish(String type) {
        this.type = switch (type.toLowerCase()) {
            case "fries" -> "Fries";
            case "eggs" -> "Eggs";
            case "salad" -> "Salad";
            default -> "Fries";
        };
        this.price = switch (type.toLowerCase()) {
            case "fries" -> 6.00;
            case "eggs" -> 3.00;
            case "salad" -> 4.50;
            default -> 6.00;
        };
    }

    public double getPrice() {
        return this.price;
    }

    public String getType() {
        return type;
    }

    
}
