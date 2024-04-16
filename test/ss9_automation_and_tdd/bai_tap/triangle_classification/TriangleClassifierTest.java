package ss9_automation_and_tdd.bai_tap.triangle_classification;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleClassifierTest {
    TriangleClassifier triangleClassifier = new TriangleClassifier();
    @Test
    public void testTriangle1() {
        double side1 = 0;
        double side2 = 1;
        double side3 = 1;
        String expected = "is not a triangle";
        String actual = triangleClassifier.checkTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testTriangle2() {
        double side1 = 1;
        double side2 = 0;
        double side3 = 1;
        String expected = "is not a triangle";
        String actual = triangleClassifier.checkTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testTriangle3() {
        double side1 = 1;
        double side2 = 1;
        double side3 = 0;
        String expected = "is not a triangle";
        String actual = triangleClassifier.checkTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testTriangle4() {
        double side1 = -1;
        double side2 = 1;
        double side3 = 1;
        String expected = "is not a triangle";
        String actual = triangleClassifier.checkTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testTriangle5() {
        double side1 = 1;
        double side2 = -1;
        double side3 = 1;
        String expected = "is not a triangle";
        String actual = triangleClassifier.checkTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testTriangle6() {
        double side1 = 1;
        double side2 = 1;
        double side3 = -1;
        String expected = "is not a triangle";
        String actual = triangleClassifier.checkTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testTriangle7() {
        double side1 = 6;
        double side2 = 2;
        double side3 = 2;
        String expected = "is not a triangle";
        String actual = triangleClassifier.checkTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testTriangle8() {
        double side1 = 2;
        double side2 = 6;
        double side3 = 2;
        String expected = "is not a triangle";
        String actual = triangleClassifier.checkTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testTriangle9() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 6;
        String expected = "is not a triangle";
        String actual = triangleClassifier.checkTriangle(side1,side2,side3);
        assertEquals(expected,actual);
    }
    @Test
    public void testTriangle10() {
        double side1 = 3;
        double side2 = 3;
        double side3 = 3;
        String expected = "is an equilateral triangle";
        String actual = triangleClassifier.checkTriangle(side1, side2, side3);
        assertEquals(expected, actual);
    }
    @Test
    public void testTriangle11() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 3;
        String expected = "is an isosceles triangle";
        String actual = triangleClassifier.checkTriangle(side1, side2, side3);
        assertEquals(expected, actual);
    }
    @Test
    public void testTriangle12() {
        double side1 = 3;
        double side2 = 2;
        double side3 = 2;
        String expected = "is an isosceles triangle";
        String actual = triangleClassifier.checkTriangle(side1, side2, side3);
        assertEquals(expected, actual);
    }
    @Test
    public void testTriangle13() {
        double side1 = 2;
        double side2 = 3;
        double side3 = 2;
        String expected = "is an isosceles triangle";
        String actual = triangleClassifier.checkTriangle(side1, side2, side3);
        assertEquals(expected, actual);
    }
    @Test
    public void testTriangle14() {
        double side1 = 4;
        double side2 = 2;
        double side3 = 3;
        String expected = "is a triangle";
        String actual = triangleClassifier.checkTriangle(side1, side2, side3);
        assertEquals(expected, actual);
    }
}
