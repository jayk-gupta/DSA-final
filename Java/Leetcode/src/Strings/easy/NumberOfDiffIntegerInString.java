package Strings.easy;
//https://leetcode.com/problems/number-of-different-integers-in-a-string/description/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDiffIntegerInString {
    public static void main(String[] args) {
        String word = "01abnm1jkj0001oin00000001r";
        System.out.println("Input string: " + word);
        System.out.println("Number of different integers: " + numDifferentIntegers(word));
    }

    public static int numDifferentIntegers(String word) {
        // Pattern to match sequences of digits
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(word);

        // Set to store unique integers
        Set<String> uniqueIntegers = new HashSet<>();

        // Find all digit sequences in the input string
        while (m.find()) {

            // Remove leading zeros from the digit sequence
            String normalizedDigitSequence = m.group().replaceFirst("^0+(?!$)", "");

            uniqueIntegers.add(normalizedDigitSequence);
        }

        // Return the number of unique integers
        return uniqueIntegers.size();
    }
}
