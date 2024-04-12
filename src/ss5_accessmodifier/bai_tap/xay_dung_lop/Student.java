package ss5_accessmodifier.bai_tap.xay_dung_lop;

public class Student {
    private String name;
    private String clases;

    public Student() {
        this.name = "john";
        this.clases = "C02";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    public String getClases() {
        return clases;
    }
}
