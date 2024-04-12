package ss6_inheritance.bai_tap.bai1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumetric() {
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "height= " + height +" "+ super.toString()+ " V= "+getVolumetric();
    }
}
