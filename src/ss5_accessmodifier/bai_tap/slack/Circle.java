package ss5_accessmodifier.bai_tap.slack;

public class Circle {
    private int id;
    private double radius;
    public static int count = 0;
    private static final double PI = 3.14;
    public static double maxRadius = 0;
    public static double sum = 0;


    public Circle(double radius) {
        this.radius = radius;
        this.id = ++count;
        if (radius > maxRadius) {
            maxRadius = radius;
        }
        sum += getArea();
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * radius * PI;
    }

    public int getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    public static int getCount() {
        return count;
    }

    public static double getMaxRadius() {
        return maxRadius;
    }

    @Override
    public String toString() {
        return  "id = " + id + ", radius 22= " + radius + ", S = " + getArea() + ", C = " + getPerimeter() ;
    }
}
