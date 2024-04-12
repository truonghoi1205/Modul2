package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class slack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
        System.out.println("input C");
        int Celsius = input.nextInt();
        int Fahrenheit = Celsius * 9 / 5 + 32;
        System.out.println(Celsius +" độ C = "+ Fahrenheit + " độ F");*/

        /*Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
        System.out.println("input M");
        double Met = input.nextDouble();
        double Feet = Met * 3.2808;
        System.out.println(Met + "m = " + Feet  + "ft");*/

        /*Bài 3: Tính diện tích hình vuông khi biết cạnh a.
        System.out.println("input a");
        int a = input.nextInt();
        int S = a * a;
        System.out.println("diện tích hình vuông: " + S);*/

        /*Bài 4: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b
        System.out.println("input a,b");
        int a = input.nextInt();
        int b = input.nextInt();
        int S = a * b;
        System.out.println("diện tích hình chữ nhật: " + S);*/

        /*Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
        System.out.println("input a,b");
        int a = input.nextInt();
        int b = input.nextInt();
        int S = (a * b) / 2;
        System.out.println("diện tích tam giác vuông: " + S);*/

        /*Bài 6: Giải phương trình bậc 1.
        System.out.println("input a,b");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double x;
        if (a == 0) {
            System.out.println("phương trình vô nghiệm");
        } else {
            x = -b/a;
            System.out.println("phương trình có 1 nghiệm: " +x);
        }*/

        /*Bài 7: Giải phương trình bậc 2.
        System.out.println("input a,b,c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = b * b - 4 * a * c;
        double x1, x2;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / 2 * a;
            x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + " x2 = " + x2);
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Phương trình có 1 nghiệm duy nhất: x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }*/

        /*Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không.
                 Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
        System.out.println("input age");
        int age = input.nextInt();
        if (age > 0 && age < 120) {
            System.out.println("đây là tuổi của 1 người");
        } else {
            System.out.println("đây không phải là tuổi của 1 người");
        }*/

        /*Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác.
                 Điều kiện để a,b,c là cạnh của một tam giác là:
                 a,b,c > 0
                 a + b > c
                 b + c > a
                 a + c > b
        System.out.println("input a,b,c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            System.out.println("đủ điều kiện là 1 tam giác");
        } else {
            System.out.println("không đủ điều kiện là 1 tam giác");
        }*/

        /*Bài 10: Viết chương trình tính giá điện
        System.out.println("input kWh");
        double kWh = input.nextDouble();
        double bac1, bac2, bac3, bac4, bac5, bac6;
        if (kWh > 0 && kWh <= 50) {
            bac1 = kWh * 1.806;
            System.out.println("giá điện: " + bac1);
        } else if (kWh > 50 && kWh <= 100) {
            bac2 = 50 * 1.806 + (kWh - 50) * 1.866;
            System.out.println("giá điện: " + bac2);
        } else if (kWh > 100 && kWh <= 200) {
            bac3 = 50 * 1.806 + 50 * 1.866 + (kWh - 100) * 2.167;
            System.out.println("giá điện: " + bac3);
        } else if (kWh > 200 && kWh <= 300) {
            bac4 = 50 * 1.806 + 50 * 1.866 + 100 * 2.167 + (kWh - 200) * 2.729;
            System.out.println("giá điện: " + bac4);
        } else if (kWh > 300 && kWh <= 400) {
            bac5 = 50 * 1.806 + 50 * 1.866 + 100 * 2.167 + 100 * 2.729 + (kWh - 300) * 3.050;
            System.out.println("giá điện: " + bac5);
        } else {
            bac6 = 50 * 1.806 + 50 * 1.866 + 100 * 2.167 + 100 * 2.729 + 100 * 3.050 + (kWh - 400) * 3.151;
            System.out.println("giá điện: " + bac6);
        }*/

        /*Bài 11: Viết chương trình tính thuế thu nhập cá nhân.
        System.out.println("input thu nhập tính thuế");
        double money = input.nextDouble();
        double bac1, bac2, bac3, bac4, bac5, bac6;
        if (money > 0 && money <= 5000000) {
            bac1 = money * 0.05;
            System.out.println("tiền thuế: " + bac1);
        } else if (money > 5000000 && money <= 10000000) {
            bac2 = 5000000 * 0.05 + (money - 5000000) * 0.1;
            System.out.println("tiền thuế: " + bac2);
        } else if (money > 10000000 && money <= 18000000) {
            bac3 = 5000000 * 0.05 + 5000000 * 0.1 + (money - 100) * 0.15;
            System.out.println("tiền thuế: " + bac3);
        } else if (money > 18000000 && money <= 32000000) {
            bac4 = 5000000 * 0.05 + 5000000 * 0.1 + 8000000 * 0.15 + (money - 18000000) * 0.2;
            System.out.println("tiền thuế: " + bac4);
        } else if (money > 32000000 && money <= 52000000) {
            bac5 = 5000000 * 0.05 + 5000000 * 0.1 + 8000000 * 0.15 + 18000000 * 0.2 + (money - 32000000) * 0.25;
            System.out.println("tiền thuế: " + bac5);
        } else {
            bac6 = 5000000 * 0.05 + 5000000 * 0.1 + 8000000 * 0.15 + 18000000 * 0.2 + 38000000 * 0.25 + (money - 52000000) * 0.3;
            System.out.println("giá điện: " + bac6);
        }*/
    }
}