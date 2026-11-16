// PharmacySystem.java
public class PharmacySystem {
    public static void main(String[] args) {
        // Create an array of PharmacyPerson type (Polymorphism)
        PharmacyPerson[] people = new PharmacyPerson[2];
        people[0] = new Pharmacist("John Doe", 30, "P121", 5);
        people[1] = new Customer("Jane Smith", 25, "C456");

        // Loop using polymorphism to call displayInfo() and specific methods
        for (PharmacyPerson person : people) {
            person.displayInfo(); // Calls overridden method
            System.out.println("Class Type: " + person.getClass().getSimpleName());

            // Downcasting using instanceof
            if (person instanceof Pharmacist) {
                ((Pharmacist) person).dispenseMedication("Amoxicillin");
            } else if (person instanceof Customer) {
                ((Customer) person).addPrescription("Ibuprofen");
            }
            System.out.println();
        }

        // Add another loop to print the names of all persons along with their class types
        System.out.println("Names of all persons in the system:");
        for (PharmacyPerson person : people) {
            System.out.println("Name: " + person.name + ", Class Type: " + person.getClass().getSimpleName());
        }
    }
}
