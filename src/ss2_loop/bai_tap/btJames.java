package ss2_loop.bai_tap;

import java.util.Scanner;

public class btJames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Hiển thị hình
        // hình chữ nhật
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //tam giác 1:
        for (int i = 1; i <= 6; i++) {
            System.out.println();
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
        //tam giác 2:
        for (int i = 6; i >= 1; i--) {
            System.out.println();
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
        //tam giác 3:
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
        //tam giác 4:
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= 5-i ; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
        //tam giác cân:
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");//
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }*/

        /*Hiển thị 20 số nguyên tố đầu tiên
        System.out.println("input SNT cần in");
        int numbers = input.nextInt();
        int countSNT = 0;
        int N = 2;

        while (true) {
            int count = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(N + " là SNT");
                countSNT++;
            }
            N++;
            if (countSNT == numbers) {
                break;
            }
        }*/

        /*Hiển thị các số nguyên tố nhỏ hơn 100
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " là SNT");
            } else {
                System.out.println(i + " không là SNT");
            }
        }*/
    }
}