package ss11_dsa_stack_queue.bai2;

import java.util.*;

public class MyTreeMap {
    
    public static void main(String[] args) {
        String str ="Hello world, hello";
        str = str.replaceAll(",","");
        str = str.toLowerCase(Locale.ROOT);
        String[] arr = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : arr) {
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                int value = map.get(s);
                map.put(s, ++value);
            }
        }
        System.out.println(map);
    }
}
