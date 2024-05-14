package ss19_string_and_regex.bai_tap.validate_phone_number;

public class PhoneNumberExampleTest {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String[] validPhone = new String[]{"(84)-(0978489648)","(a8)-(22222222)","(84)-(22b22222)","(84)-(0222222222)"};

    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        for(String phoneNumber : validPhone) {
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            if(isValid) {
                System.out.println(ANSI_YELLOW + "SĐT: " + phoneNumber + " hợp lệ");
            } else {
                System.out.println(ANSI_RED + "SĐT: " + phoneNumber + " không hợp lệ");
            }
        }
    }
}
