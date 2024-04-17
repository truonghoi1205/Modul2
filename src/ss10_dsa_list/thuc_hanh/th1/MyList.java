package ss10_dsa_list.thuc_hanh.th1;

import java.util.Arrays;

public class MyList {
    private Object[] arrays;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;


    public MyList() {
        this.arrays = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa() {
        int newSize = arrays.length*2;
        arrays = Arrays.copyOf(arrays,newSize);
    }
}
