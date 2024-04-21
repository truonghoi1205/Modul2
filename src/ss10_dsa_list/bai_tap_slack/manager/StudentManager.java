package ss10_dsa_list.bai_tap_slack;

import java.util.ArrayList;

public class StudentManager {
    private final ArrayList<Student> studentLists;

    public StudentManager() {
        this.studentLists = new ArrayList<>();
    }

    public void displayStudent() {
        System.out.println("List of student: ");
        for (Student student : studentLists) {
            System.out.println(student);
        }
    }

    public void addStudent(Student student) {
        studentLists.add(student);
    }

    public void deleteStudent(int id) {
        for (Student student : studentLists) {
            if (id == student.getId()) {
                studentLists.remove(id);
                break;
            }
        }
    }
    public void displayStudentsWithHighGPA() {
        for (Student student : studentLists) {
            if (student.getGpa() > 8) {
                System.out.println(student);
            }
        }
    }
}
