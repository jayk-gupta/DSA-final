package Strings;

import java.util.Arrays;

//    Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
public class IsAnagram {
    public static void main(String[] args) {
        String s = "leapp", t = "appel";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
  char[] str1 = s.toCharArray();
  char[] str2 = t.toCharArray();
        Arrays.sort(str2);
        Arrays.sort(str1);
        for (int i = 0; i < s.length(); i++) {
            if (str1[i] != str2[i]) return false;
        }
        return true;
    }

}
