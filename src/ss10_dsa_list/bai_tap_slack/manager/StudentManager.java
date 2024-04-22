package ss10_dsa_list.bai_tap_slack.manager;

import ss10_dsa_list.bai_tap_slack.model.Student;

import java.util.ArrayList;

public class StudentManager implements IManager<Student> {
    ArrayList<Student> studentLists;

    public StudentManager() {
        this.studentLists = new ArrayList<>();
    }

    @Override
    public void displayStudent() {
        System.out.println("List of student: ");
        for (Student student : studentLists) {
            System.out.println(student);
        }
    }

    @Override
    public void addStudent(Student student) {
        studentLists.add(student);
    }

    public void deleteStudent(int id) {
        int index = findIndexById(id);
        studentLists.remove(index);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < studentLists.size(); i++) {
            if (studentLists.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void displayStudentsWithHighGPA() {
        for (Student student : studentLists) {
            if (student.getGpa() > 8) {
                System.out.println(student);
            }
        }
    }
    
}
