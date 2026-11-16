// PharmacySystem.java
import java.util.Random;

public class PharmacySystem {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate random IDs (e.g., P followed by numbers, C followed by numbers)
        String pharmacistLicense = "P" + (400000 + rand.nextInt(900000));
        String customerID = "C" + (100 + rand.nextInt(900));

        // Create instances for Pharmacist and Customer
        Pharmacist pharmacist = new Pharmacist("John Doe", 30, "P123", pharmacistLicense, 5);
        Customer customer = new Customer("Jane Smith", 25, "C234", customerID);

        // Test Pharmacist methods
        pharmacist.displayInfo();
        pharmacist.dispenseMedication("Amoxicillin");
        System.out.println();

        // Test Customer methods
        customer.displayInfo();
        customer.addPrescription("Paracetamol");
    }
}
