package ss5_accessmodifier.thuc_hanh.static_method;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(111,"Phúc");
        Student student2 = new Student(222,"Cường");
        Student student3 = new Student(333,"Hiếu");

        student1.display();
        student2.display();
        student3.display();

    }
}
