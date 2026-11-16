// Medicine.java
public class Medicine {
    // Attributes
    private String name;
    private int id;
    private double price;
    private int quantity;

    // 1. Parameterized Constructor
    public Medicine(String name, int id, double price, int quantity) {
        setInformation(name, id, price, quantity);
    }

    // 2. Copy Constructor (Duplicates an existing Medicine object)
    public Medicine(Medicine other) {
        this.name = other.name;
        this.id = other.id;
        this.price = other.price;
        this.quantity = other.quantity;
    }

    // Method to set information with error handling for negative values
    public void setInformation(String name, int id, double price, int quantity) {
        if (price < 0 || quantity < 0) {
            System.out.println("Error: Price and Quantity cannot be negative!");
            return;
        }
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to check if medicine is in stock
    public boolean isInStock() {
        return this.quantity > 0;
    }

    // Method to calculate total price
    public double calculateTotalPrice(int purchaseQuantity) {
        if (purchaseQuantity > this.quantity) {
            System.out.println("Error: Requested quantity exceeds available stock!");
            return 0.0;
        }
        return this.price * purchaseQuantity;
    }

    // Method to display medicine information
    public void displayInfo() {
        System.out.println("Medicine Name: " + name);
        System.out.println("Medicine ID: " + id);
        System.out.println("Price: $" + price);
        System.out.println("Quantity Available: " + quantity);
        System.out.println("Is In Stock: " + isInStock());
    }
}
