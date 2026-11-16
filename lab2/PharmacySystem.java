// PharmacySystem.java
import java.util.Scanner;

public class PharmacySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Medicine medicine = new Medicine();

        // Collect user input for medicine details
        System.out.print("Enter Medicine Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Medicine ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Medicine Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Medicine Quantity: ");
        int quantity = scanner.nextInt();

        // Set information
        medicine.setInformation(name, id, price, quantity);
        System.out.println();

        // Display information
        medicine.displayInfo();
        System.out.println();

        // If in stock, prompt for purchase quantity
        if (medicine.isInStock()) {
            System.out.print("Enter Quantity to Purchase: ");
            int purchaseQty = scanner.nextInt();
            
            double totalPrice = medicine.calculateTotalPrice(purchaseQty);
            if (totalPrice > 0) {
                System.out.printf("Total Price for %d units: $%.2f%n", purchaseQty, totalPrice);
            }
        } else {
            System.out.println("Sorry, this medicine is currently out of stock.");
        }

        scanner.close();
    }
}
