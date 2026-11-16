// Pharmacist.java
public class Pharmacist extends Person {
    private String licenseNumber;
    private int yearsOfExperience;

    public Pharmacist(String name, int age, String id, String licenseNumber, int yearsOfExperience) {
        super(name, age, id);
        this.licenseNumber = licenseNumber;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pharmacist Information:");
        System.out.print("Name: " + name + ", Age: " + age + ", ID: " + id);
        System.out.println(", License Number: " + licenseNumber + ", Years of Experience: " + yearsOfExperience);
    }

    public void dispenseMedication(String medication) {
        System.out.println("Pharmacist " + name + " is dispensing medication: " + medication);
    }
}
