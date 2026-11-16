// Person.java
public class Person {
    private String fname;
    private String lname;
    private Date dob;

    public Person(String f, String l, Date d) {
        this.fname = f;
        this.lname = l;
        this.dob = new Date(d); // Copy constructor usage
    }

    @Override
    public String toString() {
        return String.format("\nFName:%s, LName:%s, birth:%s", fname, lname, dob);
    }
}
