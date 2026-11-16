// Student.java
public class Student extends Person {
    private int sid;
    private String dept;
    private int gr1, gr2, gr3;

    public Student(String f, String l, Date d, int i, String dpt) {
        super(f, l, d);
        this.sid = i;
        this.dept = dpt;
    }

    public void setGrades(int g1, int g2, int g3) {
        this.gr1 = g1;
        this.gr2 = g2;
        this.gr3 = g3;
    }

    public int gradesAverage() {
        return (gr1 + gr2 + gr3) / 3;
    }

    @Override
    public String toString() {
        return String.format("\nID:%d, \nDepartment: %s; %s, grade1=%d, grade2=%d, grade3=%d, GradeAverage=%d", 
            sid, dept, super.toString(), gr1, gr2, gr3, gradesAverage());
    }
}
