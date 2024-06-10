package Strings.easy;

import java.util.Arrays;

public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length-1].length();
    }
}
