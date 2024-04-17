package ss10_dsa_list.bai_tap_slack;

public class Student {
    private static int lastedId = 0;
    private int id ;
    private String name;
    private String email;
    private double gpa;

    public Student( String name, String email, double gpa) {
        this.name = name;
        this.email = email;
        this.gpa = gpa;
        this.id = ++lastedId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("Student id = %d, name = %s, email = %s, gpa = %s", id, name, email, gpa);
    }
}
