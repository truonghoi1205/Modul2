package ss3_array.bai_tap_nangcao;

import java.util.Arrays;
import java.util.Scanner;

public class btJamesNC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Tính tổng các số ở một cột xác định

        System.out.println("nhập số phần tử trong mảng");
        int N = input.nextInt();
        int M = input.nextInt();
        double[][] arr = new double[N][M];
        System.out.println("nhập " + arr.length + " rows and " +
                arr[0].length + " columns: ");
        for (int row = 0; row < arr.length; row++) {
            System.out.println("nhập mảng tiếp theo");
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = input.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("mày muốn tính tổng cột nào?");
        int index = input.nextInt();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][index];
        }
        System.out.println(sum);*/

        /*Tính tổng các số ở đường chéo chính của ma trận vuông

        System.out.println("nhập số phần tử trong mảng");
        int N = input.nextInt();
        int M = input.nextInt();
        double[][] arr = new double[N][M];
        System.out.println("nhập " + arr.length + " rows and " +
                arr[0].length + " columns: ");
        for (int row = 0; row < arr.length; row++) {
            System.out.println("nhập mảng tiếp theo");
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = input.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
                sum +=arr[i][i];
        }
        System.out.println(sum);*/

        /*Đếm số lần xuất hiện của ký tự trong chuỗi
        String str = "học code cùng codegym";
        System.out.println("nhập vào kí tự");
        char character = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("số lần xuất hiện kí tự " + character + " là: " + count);*/


    }
}
