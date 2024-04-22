package ss10_dsa_list.bai_tap_slack.manager;

import ss10_dsa_list.bai_tap_slack.model.Student;

import java.util.ArrayList;

public interface IManager<E> {
    void displayStudent();
    void addStudent(Student student);
    void deleteStudent(int id);
    int findIndexById(int id);
    void displayStudentsWithHighGPA();

}
