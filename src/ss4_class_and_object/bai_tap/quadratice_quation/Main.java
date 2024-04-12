package ss4_class_and_object.bai_tap.quadratice_quation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập a,b,c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("phương trình có 2 nghiệm phân biệt x1= " + quadraticEquation.getRoot1() + ", x2= " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("phương trình có 1 nghiệm kép x= " + quadraticEquation.getRoot1());
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
