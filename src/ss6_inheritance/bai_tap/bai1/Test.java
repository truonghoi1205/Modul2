package ss6_inheritance.bai_tap.bai1;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"white");
        System.out.println(circle);
        System.out.println("Area= "+ circle.getArea());
        Cylinder cylinder = new Cylinder(2, "black",4);
        System.out.println(cylinder);
    }
}
