// Customer.java
import java.util.ArrayList;

public class Customer extends Person {
    private String customerID;
    private ArrayList<String> prescriptionList;

    public Customer(String name, int age, String id, String customerID) {
        super(name, age, id);
        this.customerID = customerID;
        this.prescriptionList = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer Information:");
        System.out.print("Name: " + name + ", Age: " + age + ", ID: " + id);
        System.out.println(", Customer ID: " + customerID + ", Prescriptions: " + prescriptionList);
    }

    public void addPrescription(String prescription) {
        prescriptionList.add(prescription);
        System.out.println("Customer " + name + " added a prescription: " + prescription);
    }
}
