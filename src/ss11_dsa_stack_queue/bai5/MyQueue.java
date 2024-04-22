package ss11_dsa_stack_queue.bai5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class MyQueue {


    public static void checkPalindrome(String palindrome) {
        palindrome = palindrome.toLowerCase();
        String[] arr = palindrome.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (String s : arr) {
            stack.push(s);
            queue.add(s);
        }
        for (int i = 0; i < queue.size(); i++) {
            if(!Objects.equals(stack.pop(), queue.poll())) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }

    public static void main(String[] args) {
        String palindrome = "Able was I ere I saw Elba";
        checkPalindrome(palindrome);

    }
}
