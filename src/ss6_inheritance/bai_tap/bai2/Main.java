package ss6_inheritance.bai_tap.bai2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(2,3,4);
        point3D.setZ(3.4f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        Point2D point2D = new Point2D();
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
