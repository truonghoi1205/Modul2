package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class btJames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Xoá phần tử khỏi mảng:
        System.out.println("nhập số cần xóa");
        int index = -1;
        int x = input.nextInt();
        int[] arr = {3, 4, 1, 6, 2, 7, 5};
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println(Arrays.toString(arr));
            return;
        } else {
            for (; index < arr.length - 1; index++) {
                    arr[index] = arr[index + 1];
            }
            arr[arr.length - 1] = 0;
        }

        System.out.println(Arrays.toString(arr));*/

        /*Thêm phần tử vào mảng:
        int[] arr = {3, 4, 5, 6, 7, 8, 9};//[3,4,5,2,6,7,8]
        System.out.println("nhập số cần thêm");
        int x = input.nextInt();
        System.out.println("nhập vị trí cần thêm");
        int index = input.nextInt();
        if (index <= -1 || index >= arr.length - 1) {
            System.out.println("không chèn được vào mảng");
        }
        for (; index <= arr.length - 1; index++) {
            int temp = 0;
            temp = x;
            x = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));*/

        /*Gộp mảng:
        int[] arr1 = new int[3];
        int[] arr2 = new int[4];
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        System.out.println("Enter array1");
        while (i < arr1.length) {
            arr1[i] = input.nextInt();
            arr3[i] = arr1[i];
            i++;
        }
        i = 0;
        System.out.println("Enter array2");
        while (i < arr2.length) {
            arr2[i] = input.nextInt();
            arr3[arr1.length + i] = arr2[i];
            i++;
        }
        System.out.println(Arrays.toString(arr3));*/

        /* Tìm phần tử lớn nhất trong mảng hai chiều:
        int[][] arr = {
                {3, 4, 5},
                {4, 5, 6},
                {5, 7, 8}
        };
        int max = 0;
        int a = 0, b = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(max);
        System.out.println("tọa độ của max: " + a + b);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }*/

        /*Tìm phần tử nhỏ nhất trong mảng chiều:*/
        System.out.println("nhập số phần tử mảng");
        int N = input.nextInt();
        int[] arr = new int[N];
        System.out.println("nhập phần tử cho mảng");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+min);
    }
}
