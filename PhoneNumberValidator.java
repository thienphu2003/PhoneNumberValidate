import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    private static final String PHONE_NUMBER_PATTERN = "\\(([0-9]{2})\\)-\\(([0-9]{10})\\)";

    public static boolean isValidPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String phoneNumber = "(84)-(0978489648)";
        System.out.println(PhoneNumberValidator.isValidPhoneNumber(phoneNumber));  // true

        phoneNumber = "(a8)-(22222222)";
        System.out.println(PhoneNumberValidator.isValidPhoneNumber(phoneNumber));  // false
    }
}

