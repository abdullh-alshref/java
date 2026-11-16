// Pharmacist.java
public class Pharmacist extends PharmacyPerson {
    private String licenseNumber;
    private int yearsOfExperience;

    public Pharmacist(String name, int age, String licenseNumber, int yearsOfExperience) {
        super(name, age);
        this.licenseNumber = licenseNumber;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pharmacist Name: " + name + ", Age: " + age + ", License Number: " + licenseNumber + ", Years of Experience: " + yearsOfExperience);
    }

    public void dispenseMedication(String medication) {
        System.out.println(name + " is dispensing medication: " + medication);
    }
}
