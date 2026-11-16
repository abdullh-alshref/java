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

    // Method to display medicine information
    public void displayInfo() {
        System.out.println("Medicine Name: " + name);
        System.out.println("Medicine ID: " + id);
        System.out.println("Medicine Price: $" + price);
        System.out.println("Medicine Quantity: " + quantity);
    }

    // Method to check if medicine is in stock
    public boolean isinStock() {
        return this.quantity > 0;
    }

    // Bonus: Method to calculate total price for a given purchase quantity
    public double calculateTotalPrice(int purchaseQuantity) {
        return this.price * purchaseQuantity;
    }
}
