package ss8_clean_code.bai_tap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("DS quản lý sinh viên sau khi thêm"); //thêm học viên
        StudentManager studentManager = new StudentManager();
        double[] score = {3.5, 4.6, 6.9};
        Student student1 = new Student(1, "Tom", score, "male");
        studentManager.add(student1);
        double[] score2 = {7.5, 4.6, 6.8};
        Student student2 = new Student(2, "Jerry", score2, "female");
        studentManager.add(student2);
        double[] score3 = {7.5, 10, 6.8};
        Student student3 = new Student(3, "Tickey", score3, "female");
        studentManager.add(student3);
        System.out.println(Arrays.toString(studentManager.getArrStudent()));

//        System.out.println("DS quản lý sinh viên sau khi xóa");// xóa học viên
//        studentManager.delete(1);

        System.out.println(Arrays.toString(studentManager.getArrStudent()));
        Student id = studentManager.findById(2);// tìm kiếm theo id
        System.out.println(id);

        Student name = studentManager.findByName("T");//tìm kiếm theo tên
        System.out.println(name);

        Student max = studentManager.findMaxAverage();
        System.out.println(max);

    }

}
