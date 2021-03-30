package algorithm.solutions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
  static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong

    //criteria:

    //Its length is at least 6.
    //It contains at least one digit.
    //It contains at least one lowercase English character.
    //It contains at least one uppercase English character.
    //It contains at least one special character. The special characters are: !@#$%^&*()-+

    int missingCharacters = 0;
    if (!containsDigit(password)) missingCharacters++;
    if (!containsLowercaseCharacter(password)) missingCharacters++;
    if (!containsUppercaseCharacter(password)) missingCharacters++;
    if (!containsSpecialCharacter(password)) missingCharacters++;
    int missingLength = 6 - n;
    return Math.max(missingCharacters, missingLength);
  }

  private static boolean containsDigit(String password) {
    Pattern pattern = Pattern.compile(".*\\d.*");
    Matcher match = pattern.matcher(password);
    return match.matches();
  }

  private static boolean containsLowercaseCharacter(String password) {
    Pattern pattern = Pattern.compile(".*[a-z].*");
    Matcher match = pattern.matcher(password);
    return match.matches();
  }

  private static boolean containsUppercaseCharacter(String password) {
    Pattern pattern = Pattern.compile(".*[A-Z].*");
    Matcher match = pattern.matcher(password);
    return match.matches();
  }

  private static boolean containsSpecialCharacter(String password) {
    Pattern pattern = Pattern.compile(".*[!@#$%^&*()+-].*");
    Matcher match = pattern.matcher(password);
    return match.matches();
  }
}
