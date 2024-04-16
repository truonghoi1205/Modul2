package ss8_clean_code.bai_tap;

public class StudentManager {
    private Student[] arrStudent = new Student[0];

    // [st1, st2, st3, 0]
    public void add(Student student) {// thêm học viên
        Student[] new_arr = new Student[arrStudent.length + 1];
        for (int i = 0; i < arrStudent.length; i++) {
            new_arr[i] = arrStudent[i];
        }
        new_arr[new_arr.length - 1] = student;
        arrStudent = new_arr;
    }

    public void delete(int id) {// xóa học viên theo id
        int index = 0;
        Student[] new_arr = new Student[arrStudent.length - 1];
        for (Student student : arrStudent) {
            if (student.getId() != id) {
                new_arr[index] = student;
                index++;
            }
        }
        arrStudent = new_arr;
    }

    public Student findById(int id) {// tìm theo id học viên
        for (Student student : arrStudent) {
            if (id == student.getId()) {
                return student;
            }
        }
        return null;
    }
    public Student findByName(String name) {//tìm theo tên học viên
        for (Student student : arrStudent) {
            if (student.getName().contains(name)) {
                return student;
            }
        }
        return null;
    }
    public Student findMaxAverage(){
        Student max = arrStudent[0];
        for (Student student : arrStudent) {
            if (max.average() < student.average()) {
                max = student;
            }
        }
        return max;
    }
    public Student[] getArrStudent() {
        return arrStudent;
    }
}
