package ss19_string_and_regex.bai_tap.validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassExample {
    private static final String CLASS_REGEX = "^[CAP][0-9]{4}+[GIKH]$";
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
