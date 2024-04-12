package ss7_abstract_class_and_interface.bai_tap.bai2;

import ss7_abstract_class_and_interface.bai_tap.bai1.Resizeable;
import ss7_abstract_class_and_interface.bai_tap.bai1.Shape;

public class Square extends Shape implements Colorable {
    private double width = 1.0;

    public Square(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

}
