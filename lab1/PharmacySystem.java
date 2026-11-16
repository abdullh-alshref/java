// PharmacySystem.java
public class PharmacySystem {
    public static void main(String[] args) {
        // Create Medicine objects
        Medicine med1 = new Medicine();
        Medicine med2 = new Medicine();

        // Set information for the medicines
        med1.setInformation("Paracetamol", 201, 5.50, 50);
        med2.setInformation("Ibuprofen", 202, 8.25, 0);

        // Display medicine information and stock status
        med1.displayInfo();
        System.out.println("Is in stock: " + med1.isinStock());
        if (med1.isinStock()) {
            System.out.println("Total price for 3 units: $" + med1.calculateTotalPrice(3));
        }

        System.out.println(); // Blank line for readability

        med2.displayInfo();
        System.out.println("Is in stock: " + med2.isinStock());
    }
}
