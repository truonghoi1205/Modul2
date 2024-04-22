package ss11_dsa_stack_queue.bai4;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Objects;
import java.util.Stack;

public class MyStack {
    //[Optional] [Bài tập] Kiểm tra dấu ngoặc trong biểu thức sử dụng Stack
    public static boolean check(String str) {
        String[] arr = str.split("");
        Stack<String> bStack = new Stack<>();
        for (String sym : arr) {
            if (Objects.equals(sym, "(")) {
                bStack.push(sym);
            } else if (Objects.equals(sym, ")")) {
                if (bStack.empty()) {
                    return false;
                }
                String left;
                left = bStack.pop();
                if (!Objects.equals(left, "(")) {
                    return false;
                }
            }
        }
        return bStack.empty();
    }

    public static void main(String[] args) {
        String str1 = "s * (s – a) * (s – b * (s – c)";
        String str2 = "s * (s – a) * s – b) * (s – c)";
        String str3 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";

        System.out.println(check(str1));
        System.out.println(check(str2));
        System.out.println(check(str3));
    }
}
