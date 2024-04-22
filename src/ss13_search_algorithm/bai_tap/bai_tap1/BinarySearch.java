package ss13_search_algorithm.bai_tap.bai_tap1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử vào mảng: ");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            array.add(number);
        }
        System.out.println("Mảng trước khi sắp xếp: ");
        System.out.println(array);
        sort(array);
        System.out.println("Mảng sau khi sắp xếp: ");
        System.out.println(array);
        System.out.println("Nhập số cần tìm: ");
        int value = input.nextInt();
        int result = binarySearch(array, 0, array.size() - 1, value);
        if (result == -1) {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng.");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí " + result);
        }
    }

    public static void sort(ArrayList<Integer> arr) {
        int temp = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                }
            }
        }
    }

    public static int binarySearch(ArrayList<Integer> arr, int left, int right, int value) {
        int middle = (left + right) / 2;
        int middleValue = arr.get(middle);
        if (left > right) {
            return -1;
        }
        if (middleValue == value) {
            return middle;
        }
        if (value > middleValue) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
        return binarySearch(arr, left, right, value);
    }
}
