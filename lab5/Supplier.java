// Supplier.java
public class Supplier {
    private String name;
    private String contactInfo;

    // Constructor
    public Supplier(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Method to return supplier details
    public String getSupplierDetails() {
        return name + " (" + contactInfo + ")";
    }
}
