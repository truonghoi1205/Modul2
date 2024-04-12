package ss7_abstract_class_and_interface.bai_tap.bai1;

import ss7_abstract_class_and_interface.bai_tap.bai2.Colorable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}