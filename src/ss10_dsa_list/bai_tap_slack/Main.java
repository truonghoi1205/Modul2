package ss10_dsa_list.bai_tap_slack;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("peter", "peter@gmail.com",7.0));
        manager.addStudent(new Student("tom", "tom@gmail.com",9.0));
        manager.addStudent(new Student("marry", "marry@gmail.com",8.5));
        manager.displayStudent();
        System.out.println("danh sách hs sau khi xóa: ");
        manager.deleteStudent(1);
        manager.displayStudent();
        System.out.println("danh sách hs có điểm gpa > 8: ");
        manager.displayStudentsWithHighGPA();
    }
}
