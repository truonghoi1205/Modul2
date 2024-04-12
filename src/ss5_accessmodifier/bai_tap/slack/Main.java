package ss5_accessmodifier.bai_tap.slack;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0);
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(9.0);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(Circle.maxRadius);
        System.out.println(Circle.sum);
    }

}
