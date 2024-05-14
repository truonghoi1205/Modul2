package ss19_string_and_regex.thuc_hanh.validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
   private static Pattern pattern;
   public Matcher matcher;
   private static final String EMAIL_REGEX = "^\\w+@+\\w+(\\.+\\w+)$";
   public EmailExample() {
       pattern = Pattern.compile(EMAIL_REGEX);
   }
   public boolean validate(String regex) {
       matcher = pattern.matcher(regex);
       return matcher.matches();
   }
}
