package ss10_dsa_list.bai_tap_slack.view;

import ss10_dsa_list.bai_tap_slack.manager.StudentManager;
import ss10_dsa_list.bai_tap_slack.model.Student;

import java.util.Scanner;

public class MenuStudent {
    StudentManager studentManager = new StudentManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("-------Menu-------");
            System.out.println("1. Displays a list of students");
            System.out.println("2. Add new students");
            System.out.println("3. Delete students");
            System.out.println("4. Displays a list of students with GPA > 8");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice \n");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showList();
                    break;
                case 2:
                    addNewStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    showStudentWithGpaAbove8();
                    break;
            }
        } while (choice != 0);
    }

    public void showList() {
        System.out.println("-------List Student-------");
        studentManager.displayStudent();
    }

    public void addNewStudent() {
        System.out.println("Enter student name: ");
        String name = inputString.nextLine();
        System.out.println("Enter student email: ");
        String email = inputString.nextLine();
        System.out.println("Enter GPA: ");
        double score = inputInt.nextDouble();
        Student student = new Student(name, email, score);
        studentManager.addStudent(student);
        System.out.println("==========> Add to success \n");
    }

    public void deleteStudent() {
        System.out.println("-------Delete Student-------");
        System.out.println("Enter the student id to delete: ");
        int id = inputInt.nextInt();
        studentManager.deleteStudent(id);
        System.out.println("==========> Delete to success \n");
    }

    public void showStudentWithGpaAbove8() {
        System.out.println("List of students with GPA > 8: ");
        studentManager.displayStudentsWithHighGPA();
        System.out.println();
    }
}
