package ss19_string_and_regex.thuc_hanh.validate_account;

public class AccountExampleTest {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String[] validAccount = new String[]{"123abc_", "_abc123","12345","123456","abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String account: validAccount) {
            boolean isValid = accountExample.validate(account);
            if(isValid) {
                System.out.println(ANSI_YELLOW + "account: " + account + " hợp lệ");
            } else {
                System.out.println(ANSI_RED + "account: " + account + " không hợp lệ");
            }
        }
    }
}
