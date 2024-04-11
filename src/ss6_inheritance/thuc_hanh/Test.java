package ss6_inheritance.thuc_hanh;

public class TestShape {
    public static void main(String[] args) {
        //testShape
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("yellow",false);
        System.out.println(shape);
        //testCircle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2.5);
        System.out.println(circle);

        circle = new Circle("yellow",false,3.2);
        System.out.println(circle);
        //testRectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3,3);
        System.out.println(rectangle);

        rectangle = new Rectangle("red",false,3,3);
        System.out.println(rectangle);
    }
}
