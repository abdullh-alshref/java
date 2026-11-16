// Date.java
public class Date {
    private int dd;
    private int mm;
    private int yy;

    // Parameterized Constructor
    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    // Copy Constructor
    public Date(Date d) {
        this.dd = d.dd;
        this.mm = d.mm;
        this.yy = d.yy;
    }

    @Override
    public String toString() {
        return "-->Day:" + dd + ";Month:" + mm + ";Year:" + yy;
    }
}
