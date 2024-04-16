package ss9_automation_and_tdd.bai_tap.triangle_classification;

public class TriangleClassifier {
    public String checkTriangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "is not a triangle";
        }
        if (side2 + side3 < side1 || side1 + side3 < side2 || side1 + side2 < side3) {
            return "is not a triangle";
        }
        if(side1 == side2 && side1 == side3 && side2 == side3) {
            return "is an equilateral triangle";
        }
        if(side1 == side2 || side2 == side3 || side1 == side3) {
            return "is an isosceles triangle";
        }
        return "is a triangle";
    }
}
