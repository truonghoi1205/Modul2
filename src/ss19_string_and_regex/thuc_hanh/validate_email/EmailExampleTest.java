package ss19_string_and_regex.thuc_hanh.validate_email;

public class EmailExampleTest {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com","@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isValidate = emailExample.validate(email);
            if (isValidate) {
                System.out.println(ANSI_YELLOW + "Email: " + email + " hợp lệ ");
            } else {
                System.out.println(ANSI_RED + "Email: " + email + " không hợp lệ");
            }

        }
    }
}
