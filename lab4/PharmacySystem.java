// PharmacySystem.java
public class PharmacySystem {
    public static void main(String[] args) {
        // 1. Create several Medicine objects using different constructors
        Medicine med1 = new Medicine(); // Uses default constructor
        Medicine med2 = new Medicine("Aspirin", 9.99, 100); // Uses 3-param constructor
        Medicine med3 = new Medicine("Ibuprofen", 5.49); // Uses 2-param constructor

        // Use overloaded updateQuantity methods to demonstrate overloading
        med1.updateQuantity(50);             // Adds 50 to med1 (quantity becomes 50)
        med2.updateQuantity(20, true);       // Adds 20 to med2 (quantity becomes 120)
        med3.updateQuantity(10, true);       // Adds 10 to med3 (quantity becomes 10)

        // Display the information of each medicine using displayInfo method
        med1.displayInfo();
        med2.displayInfo();
        med3.displayInfo();
    }
}
