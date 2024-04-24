package ss14_sort_algorithm.bai_tap.insert_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int item = list[i];
            int position = i;
            System.out.println(Arrays.toString(list));
            while (position > 0 && item < list[position - 1] ) {
                System.out.println(position);
                list[position] = list[position - 1];
                position--;
            }
            list[position] = item;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.println("nhập phần tử vào trong mảng");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(list));
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
