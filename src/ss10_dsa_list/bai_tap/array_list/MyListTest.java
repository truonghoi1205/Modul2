package ss10_dsa_list.bai_tap.array_list;

public class MyListTest {
    public static void main(String[] args) {
        // Khởi tạo một đối tượng MyList
        MyList<Integer> myList = new MyList<>();
        // Thêm các phần tử vào danh sách
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(1, 15); // Chèn phần tử 15 vào vị trí thứ 1
        myList.add(2, 15); // Chèn phần tử 15 vào vị trí thứ 1

        // Hiển thị danh sách
        System.out.println("Danh sách sau khi thêm:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Kiểm tra xem phần tử 20 có tồn tại trong danh sách không
        System.out.println("Phần tử 20 có tồn tại trong danh sách không? " + myList.contains(20));

        // Xóa phần tử 20 khỏi danh sách
        myList.remove(2);

        // Hiển thị danh sách sau khi xóa
        System.out.println("Danh sách sau khi xóa:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
