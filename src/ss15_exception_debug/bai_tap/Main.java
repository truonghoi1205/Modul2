package ss15_exception_debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            System.out.println("nhập cạnh a: ");
            a = input.nextInt();
            System.out.println("nhập cạnh b: ");
            b = input.nextInt();
            System.out.println("nhập cạnh c: ");
            c = input.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("phai la so");
        }
        try {
            if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || c + b <= a) {
                throw new IllegalTriangleException("Không phải cạnh tam giác");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
