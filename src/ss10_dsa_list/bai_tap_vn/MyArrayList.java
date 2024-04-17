package ss10_dsa_list.bai_tap_vn;


public class MyArrayList {
    public Object[] container;
    public int size = 0;
    private static final int CAPACITY = 10;

    public MyArrayList() {
        this.container = new Object[CAPACITY];
    }

    public void add(Object o) {
        this.container[size] = o;
        size++;
    }

    public void insert(int index, Object o) {
        if (index < 0 || index > size) {
            System.out.println("The element cannot be inserted at this position " + index);
        }
        if(size < 10) {
            for (int i = size; i > index; i--) {
                container[i] = container[i - 1];
            }
            container[index] = o;
            size++;
        } else {
            System.out.println("The array is full, cannot add elements to the array");
        }
    }

    public void readList() {
        for (Object o : container) {
            if (o != null) {
                System.out.println(o);
            }
        }
    }

    public Object get(int index) {
        return this.container[index];
    }

    public void remove(int index) {
        if (index > size) {
            System.out.println("The element cannot be removed at this position " + index);
        }
        for (int i = index; i < size - 1; i++) {
            container[i] = container[i + 1];
            container[i + 1] = null;
        }
        size--;
    }

    public void update(int index, Object value) {
        this.container[index] = value;
    }
}