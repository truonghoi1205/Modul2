package ss14_sort_algorithm.thuc_hanh.th1;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    static int[] list = {2, 4, 3, 5, 7, 6, 1, 9};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
                needNextPass = true;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("mảng trước khi sắp xếp: ");
        System.out.println(Arrays.toString(list));
        bubbleSort(list);
        System.out.println("mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(list));
    }
}
