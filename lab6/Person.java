// Person.java
public class Person {
    protected String name;
    protected int age;
    protected String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void displayInfo() {
        System.out.print("Name: " + name + ", Age: " + age + ", ID: " + id);
    }
}
