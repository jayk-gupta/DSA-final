package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsPalindrome {
    public static void main(String[] args) {
       String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String onlyAlphabets = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       StringBuilder b = new StringBuilder();
        for (int i = onlyAlphabets.length()-1; i >=0; i--) {
            b.append(onlyAlphabets.charAt(i));
        }
return b.toString().equals(onlyAlphabets);
    }
}
