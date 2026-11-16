// Medicine.java
public class Medicine {
    private String name;
    private int id;
    private double price;
    private int quantity;
    private Supplier supplier; // Composition relationship

    // Constructor 1: name, id, supplier (default price = 0.0, quantity = 0)
    public Medicine(String name, int id, Supplier supplier) {
        this.name = name;
        this.id = id;
        this.price = 0.0;
        this.quantity = 0;
        this.supplier = supplier;
    }

    // Constructor 2: all attributes
    public Medicine(String name, int id, double price, int quantity, Supplier supplier) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    // Method to check if medicine is in stock
    public boolean isInStock() {
        return this.quantity > 0;
    }

    // Method to calculate total price with error handling
    public double calculateTotalPrice(int purchaseQuantity) {
        if (purchaseQuantity > this.quantity) {
            System.out.println("Error: Requested quantity exceeds available stock!");
            return 0.0;
        }
        return this.price * purchaseQuantity;
    }

    // Method to display medicine details and supplier information
    public void displayInfo() {
        System.out.println("Medicine Name: " + name);
        System.out.println("Medicine ID: " + id);
        System.out.println("Price: $" + price);
        System.out.println("Quantity Available: " + quantity);
        if (supplier != null) {
            System.out.println("Supplier: " + supplier.getSupplierDetails());
        }
        System.out.println("Is In Stock: " + isInStock());
    }
}
