import java.util.Arrays;

// https://www.codewars.com/kata/525f50e3b73515a6db000b83
public class PhoneNumberFromArray {

    public static String createPhoneNumber(int[] numbers) {
        return "("
                + numbers[0]
                + numbers[1]
                + numbers[2]
                + ") "
                + numbers[3]
                + numbers[4]
                + numbers[5]
                + "-"
                + numbers[6]
                + numbers[7]
                + numbers[8]
                + numbers[9];
    }

    public static String createPhoneNumberRegEx(int[] numbers) {
        return Arrays.toString(numbers)
                .replaceAll("[, \\[\\]]", "")
                .replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
    }

}
