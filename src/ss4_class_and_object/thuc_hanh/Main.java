package ss4_class_and_object.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = input.nextInt();
        System.out.println("Enter width: ");
        int width = input.nextInt();
        Rectangle rectangle = new Rectangle(length,width);
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getC());
        System.out.println("Area of the Rectangle: "+ rectangle.getS());
        System.out.println("Your Rectangle \n" + rectangle.showRectangle() + rectangle.displayRectangle());
        System.out.println("Your Rectangle after change\n" + rectangle.editRectangle(15,17));
    }
}
