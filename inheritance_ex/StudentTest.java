// StudentTest.java
public class StudentTest {
    public static void main(String[] args) {
        // Create a Date object for birth date
        Date dob = new Date(5, 5, 2005);

        // Create a Student object and set grades
        Student st1 = new Student("Abdullah", "Alshambari", dob, 123, "Computer Science");
        st1.setGrades(85, 90, 95);

        // Print student details
        System.out.println(st1);
    }
}
