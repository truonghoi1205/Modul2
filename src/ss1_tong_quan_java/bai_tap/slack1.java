package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class slack1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
        System.out.println("Nhap so: ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a % b == 0) {
            System.out.println("a chia hết cho b");
        } else {
            System.out.println("a không chia hết cho b");
        }*/

        /* Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
        System.out.println("Nhập tuổi: ");
        int age = input.nextInt();
        if( age >= 15 && age <= 17) {
            System.out.println("đủ tuổi");
        } else {
            System.out.println("chưa đủ tuổi");
        }*/

       /* Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho
       người dùng biết số đó là lớn hay nhỏ hơn 0
        System.out.println("Nhập số nguyên: ");
        int age = input.nextInt();
        if (age > 0) {
            System.out.println("lớn hơn 0");
        }
        if (age == 0) {
            System.out.println("bằng 0");
        }
        if (age < 0 ) {
            System.out.println("nhỏ hơn 0");
        } */

        /* Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
        System.out.println("Nhập số nguyên: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if(number1 > number2 && number1 > number3) {
            System.out.println(number1 + " số 1 lớn nhất");
        } else if (number2 > number3 && number2 > number1) {
            System.out.println(number2 + " số 2 lớn nhất");
        } else {
            System.out.println(number3 + " số 3 lớn nhất");
        } */

        /* Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài
        kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
        System.out.println("nhập vào");
        double score1 = input.nextDouble();
        double score2 = input.nextDouble();
        double score3 = input.nextDouble();
        double avg = (score1 + score2 + score3) / 3;
        if (avg >= 8.0 && avg <= 10.0) {
            System.out.println("học sinh giỏi");
        } else if (avg < 8.0 && avg >= 6.5) {
            System.out.println("học sinh tiên tiến");
        } else if (avg < 6.5 && avg >= 4.5) {
            System.out.println("học sinh tb");
        } else {
            System.out.println("học sinh yếu");
        } */

        /* Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
        System.out.println("sales");
        int sale = input.nextInt();
        int commission;
        if (sale > 0 && sale <= 2000000) {
            System.out.println("tiền hoa hồng là: " + (commission = sale * 3 / 100));
        } else if (sale > 2000000 && sale <= 5000000) {
            System.out.println("tiền hoa hồng là: " + (commission = sale * 6 / 100));
        } else {
            System.out.println("tiền hoa hồng là: " + (commission = sale * 10 / 100));
        }*/

        /*Bài 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho*/
        System.out.println("cước điện thoại");
    }
}