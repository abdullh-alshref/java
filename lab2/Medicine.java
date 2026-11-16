// Medicine.java
public class Medicine {
    // Attributes
    private String name;
    private int id;
    private double price;
    private int quantity;

    // Method to set medicine information
    public void setInformation(String name, int id, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to check if the medicine is in stock
    public boolean isInStock() {
        return this.quantity > 0;
    }

    // Method to calculate total price and handle errors if requested quantity exceeds stock
    public double calculateTotalPrice(int purchaseQuantity) {
        if (purchaseQuantity > this.quantity) {
            System.out.println("Error: Requested quantity exceeds available stock!");
            return 0.0;
        }
        return this.price * purchaseQuantity;
    }

    // Method to display medicine information and stock status
    public void displayInfo() {
        System.out.println("Medicine Name: " + name);
        System.out.println("Medicine ID: " + id);
        System.out.println("Price: $" + price);
        System.out.println("Quantity Available: " + quantity);
        System.out.println("Is In Stock: " + isInStock());
    }
}
