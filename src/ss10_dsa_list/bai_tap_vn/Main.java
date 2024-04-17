package ss10_dsa_list.bai_tap_vn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
//        myArrayList.add(9);
//        myArrayList.add(10);
        //length = 10;
        //size = 10;
        System.out.println(Arrays.toString(myArrayList.container));



        myArrayList.insert(4,"a");
        System.out.println(Arrays.toString(myArrayList.container));

//        System.out.println(Arrays.toString(myArrayList.container));
//        myArrayList.insert(5,"b");
//        myArrayList.remove(5);
//        myArrayList.remove(0);
//        System.out.println(Arrays.toString(myArrayList.container));
            myArrayList.update(1,"a");
        System.out.println(Arrays.toString(myArrayList.container));
    }
}
