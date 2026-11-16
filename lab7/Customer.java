// Customer.java
import java.util.ArrayList;

public class Customer extends PharmacyPerson {
    private String customerID;
    private ArrayList<String> prescriptionList;

    public Customer(String name, int age, String customerID) {
        super(name, age);
        this.customerID = customerID;
        this.prescriptionList = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer Name: " + name + ", Age: " + age + ", Customer ID: " + customerID + ", Prescriptions: " + prescriptionList);
    }

    public void addPrescription(String prescription) {
        prescriptionList.add(prescription);
        System.out.println(name + " added prescription: " + prescription);
    }
}
