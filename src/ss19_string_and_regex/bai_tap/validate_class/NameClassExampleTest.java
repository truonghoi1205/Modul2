package ss19_string_and_regex.bai_tap.validate_class;

public class NameClassExampleTest {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String[] validClass = new String[]{"C0223G","M0318G","A0323K","P0323A"};
    public static void main(String[] args) {
        NameClassExample nameClassExample = new NameClassExample();
        for(String nameClass : validClass) {
            boolean isValid = nameClassExample.validate(nameClass);
            if(isValid) {
                System.out.println(ANSI_YELLOW + "Tên lớp: " + nameClass + " hợp lệ");
            } else {
                System.out.println(ANSI_RED + "Tên lớp: " + nameClass + " không hợp lệ");
            }
        }
    }
}
