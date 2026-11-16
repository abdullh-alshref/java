// Medicine.java
public class Medicine {
    private String name;
    private double price;
    private int quantity;

    // 1. Default Constructor
    public Medicine() {
        this.name = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    // 2. Constructor taking all three parameters
    public Medicine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 3. Constructor taking only name and price (quantity set to 0)
    public Medicine(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    // Overloaded Method 1: update quantity by adding
    public void updateQuantity(int qty) {
        if (qty >= 0) {
            this.quantity += qty;
        }
    }

    // Overloaded Method 2: update quantity based on isAdding flag
    public void updateQuantity(int qty, boolean isAdding) {
        if (isAdding) {
            this.quantity += qty;
        } else {
            if (qty <= this.quantity) {
                this.quantity -= qty;
            } else {
                this.quantity = 0; // Ensure quantity does not go below zero
            }
        }
    }

    // Display Method
    public void displayInfo() {
        System.out.println("Medicine Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }
}
