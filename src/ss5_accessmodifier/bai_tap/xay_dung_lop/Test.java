package ss5_accessmodifier.bai_tap.xay_dung_lop;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.getName()+" "+student1.getClases());
        student1.setName("mary");
        student1.setClases("C03");
        System.out.println(student1.getName()+" "+student1.getClases());
    }
}
