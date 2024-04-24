package ss14_sort_algorithm.thuc_hanh.th3;

import java.util.Arrays;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if(min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("mảng trước khi sắp xếp: ");
        System.out.println(Arrays.toString(list));
        selectionSort(list);
        System.out.println("mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(list));
    }
}
