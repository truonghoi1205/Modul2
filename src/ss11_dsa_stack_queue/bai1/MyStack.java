package ss11_dsa_stack_queue.bai1;

import java.util.Arrays;
import java.util.Stack;

public class MyStack {
    // Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Mảng trước khi đảo ngược: ");
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.print("Mảng sau khi đảo ngược: ");
        System.out.print(Arrays.toString(array));
    }

    private static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int j : array) {
            stack.push(j);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

}
