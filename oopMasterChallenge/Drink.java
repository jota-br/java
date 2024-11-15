public class Drink {

	private String type;
	private double price;
	private String size;

	public Drink(String type, String size) {
		this.type = switch (type.toLowerCase()) {
			case "coke" -> "Coke";
			case "soda" -> "Soda";
			case "juice" -> "Juice";
			default -> "Coke";
		};
		this.price = switch (size.toUpperCase().charAt(0)) {
			case 'S' -> 4.50;
			case 'M' -> 6.50;
			case 'L' -> 7.25;
			default -> 4.50;
		};
		this.size = switch (size.toUpperCase().charAt(0)) {
			case 'S' -> "Small";
			case 'M' -> "Medium";
			case 'L' -> "large";
			default -> "Small";
		};

	}

	public double getPrice() {
		return this.price;
	}

	public String getType() {
		return type;
	}

	public String getSize() {
		return size;
	}
}