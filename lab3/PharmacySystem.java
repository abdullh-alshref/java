// PharmacySystem.java
import java.util.Scanner;

public class PharmacySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user input for medicine details
        System.out.print("Enter Medicine Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Medicine ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Medicine Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Medicine Quantity: ");
        int quantity = scanner.nextInt();
        System.out.println();

        // Create Medicine object using the Parameterized Constructor
        Medicine med1 = new Medicine(name, id, price, quantity);

        // Display original medicine info
        med1.displayInfo();
        System.out.println();

        // Test the Copy Constructor by duplicating med1
        Medicine med2 = new Medicine(med1);
        System.out.println("--- Copied Medicine Information ---");
        med2.displayInfo();
        System.out.println();

        // Purchase test
        if (med1.isInStock()) {
            System.out.print("Enter Quantity to Purchase: ");
            int purchaseQty = scanner.nextInt();

            double totalPrice = med1.calculateTotalPrice(purchaseQty);
            if (totalPrice > 0) {
                System.out.printf("Total Price for %d units: $%.2f%n", purchaseQty, totalPrice);
            }
        }

        scanner.close();
    }
}
