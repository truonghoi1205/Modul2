package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class btJames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Hiển thị lời chào
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Hello: " + name);*/

        /* Ứng dụng chuyển đổi tiền tệ
        System.out.println("rate");
        int USD = input.nextInt();
        int VND = USD * 23000;
        System.out.println("Giá trị VND: " + VND);*/

        /* Ứng dụng đọc số thành chữ*/
        System.out.println("Enter Day");
        int number = input.nextInt();
        input.close();

        String result = convertNumberToWords(number);
        System.out.println(result);
    }

    public static String convertNumberToWords(int number) {
        if (number < 0 || number > 999) {
            return "out of range";
        }

        String words = "";

        if (number == 0) {
            return "zero";
        }

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        switch (hundreds) {
            case 1:
                words += "one hundred ";
                break;
            case 2:
                words += "two hundred ";
                break;
            case 3:
                words += "three hundred ";
                break;
            case 4:
                words += "four hundred ";
                break;
            case 5:
                words += "five hundred ";
                break;
            case 6:
                words += "six hundred ";
                break;
            case 7:
                words += "seven hundred ";
                break;
            case 8:
                words += "eight hundred ";
                break;
            case 9:
                words += "nine hundred ";
                break;
        }

        if (tens == 1) {
            switch (ones) {
                case 0:
                    words += "ten";
                    break;
                case 1:
                    words += "eleven";
                    break;
                case 2:
                    words += "twelve";
                    break;
                case 3:
                    words += "thirteen";
                    break;
                case 4:
                    words += "fourteen";
                    break;
                case 5:
                    words += "fifteen";
                    break;
                case 6:
                    words += "sixteen";
                    break;
                case 7:
                    words += "seventeen";
                    break;
                case 8:
                    words += "eighteen";
                    break;
                case 9:
                    words += "nineteen";
                    break;
            }
        } else {
            switch (tens) {
                case 2:
                    words += "twenty";
                    break;
                case 3:
                    words += "thirty";
                    break;
                case 4:
                    words += "forty";
                    break;
                case 5:
                    words += "fifty";
                    break;
                case 6:
                    words += "sixty";
                    break;
                case 7:
                    words += "seventy";
                    break;
                case 8:
                    words += "eighty";
                    break;
                case 9:
                    words += "ninety";
                    break;
            }

            if (tens > 1 && ones > 0) {
                words += " ";
            }

            switch (ones) {
                case 1:
                    words += "one";
                    break;
                case 2:
                    words += "two";
                    break;
                case 3:
                    words += "three";
                    break;
                case 4:
                    words += "four";
                    break;
                case 5:
                    words += "five";
                    break;
                case 6:
                    words += "six";
                    break;
                case 7:
                    words += "seven";
                    break;
                case 8:
                    words += "eight";
                    break;
                case 9:
                    words += "nine";
                    break;
            }
        }
        return words;
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}