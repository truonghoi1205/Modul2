package ss5_accessmodifier.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("bán kính hình tròn 1: "+ circle1.getRadius());
        System.out.println("diện tích hình tròn 1: "+circle1.getArea());
        Circle circle2 = new Circle(2);
        System.out.println("bán kính hình tròn 2: "+ circle2.getRadius());
        System.out.println("diện tích hình tròn 2: "+circle2.getArea());
    }
}
