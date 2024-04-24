package ss14_sort_algorithm.thuc_hanh.th2;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.println("nhập phần tử vào mảng");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("mảng trước khi sắp xếp: ");
        System.out.println(Arrays.toString(list));
        System.out.println("Các bước sắp xếp mảng ");
        bubbleSortByStep(list);
        System.out.println(Arrays.toString(list));
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Đổi " + list[j] + " với " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Mảng đã được sắp xếp: ");
                break;
            }
            System.out.print("Mảng sau khi sắp xếp lần " + i + ": ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t");
            }
            System.out.println();
        }
    }

}
