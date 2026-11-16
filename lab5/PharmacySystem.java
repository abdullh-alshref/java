// PharmacySystem.java
import java.util.Scanner;

public class PharmacySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect supplier info from user
        System.out.print("Enter supplier name: ");
        String supplierName = scanner.nextLine();

        System.out.print("Enter supplier contact info: ");
        String supplierContact = scanner.nextLine();

        // Create Supplier object
        Supplier supplier = new Supplier(supplierName, supplierContact);

        // Collect medicine info from user
        System.out.print("Enter Medicine Name: ");
        String medName = scanner.nextLine();

        System.out.print("Enter Medicine ID: ");
        int medId = scanner.nextInt();

        System.out.print("Enter Medicine Price: ");
        double medPrice = scanner.nextDouble();

        System.out.print("Enter Medicine quantity: ");
        int medQty = scanner.nextInt();
        System.out.println();

        // Create Medicine object using parameterized constructor
        Medicine medicine = new Medicine(medName, medId, medPrice, medQty, supplier);

        // Display information
        medicine.displayInfo();
        System.out.println();

        // Check stock and calculate total price for purchase
        if (medicine.isInStock()) {
            System.out.print("Enter quantity to purchase: ");
            int purchaseQty = scanner.nextInt();

            double totalPrice = medicine.calculateTotalPrice(purchaseQty);
            if (totalPrice > 0) {
                System.out.printf("Total price for %d units: $%.2f%n", purchaseQty, totalPrice);
            }
        } else {
            System.out.println("Sorry, this medicine is out of stock.");
        }

        scanner.close();
    }
}
