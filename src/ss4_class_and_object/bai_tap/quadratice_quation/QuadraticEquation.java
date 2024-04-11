package ss4_ClassAndObject.bai_tap.QuadraticEquation;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   double getDiscriminant() {
        return b*b - 4*a*c;
   }
    double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant()))/2*a;
    }
    double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant()))/2*a;
    }
}
