package ss7_abstract_class_and_interface.bai_tap.bai1;

import ss7_abstract_class_and_interface.bai_tap.bai2.Colorable;
import ss7_abstract_class_and_interface.bai_tap.bai2.Square;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(10, 5);
        shapes[2] = new Square(5);
        for (Shape shape : shapes) {
            if (shape instanceof Resizeable) {
                Resizeable a = (Resizeable) shape;
                a.resize(2);
            }
            System.out.println("New area " + shape.getArea());
            if (shape instanceof Colorable) {
                System.out.println("Color all four sides.");
            }
        }
    }
}
