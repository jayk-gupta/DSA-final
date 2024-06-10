package Strings.easy;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-string/description/
public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] word = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            word[indices[i]] = s.charAt(i);
        }

        return new String(word);
    }

}
